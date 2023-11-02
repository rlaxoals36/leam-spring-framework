package com.in28minutes.leamspringframework.examples.d1;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class SomeClass {

    private SomeDependency someDependency;

    public SomeClass(SomeDependency someDependency) {
        super();
        this.someDependency = someDependency;
        System.out.println("All dependencies are ready!");
    }
    @PostConstruct
    public void initialize() {
        someDependency.getReady(); // someDependency를 DB에서 데이터를 가져와 초기화 하려고 할때
                                    // 의존성을 연결하는대로 초기화를 실행하려면
    }
    @PreDestroy
    public void cleanup() {
        System.out.println("Cleanup");
    }
    
}

@Component
class SomeDependency {

    public void getReady() {
        System.out.println("Some logic using SomeDependency");
    }
}


@Configuration
@ComponentScan()
public class PrePostAnnotationsContextLauncherApplication {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(PrePostAnnotationsContextLauncherApplication.class);

        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);


    }
}
