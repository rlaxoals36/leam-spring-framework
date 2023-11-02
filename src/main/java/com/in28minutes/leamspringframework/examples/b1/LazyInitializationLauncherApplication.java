package com.in28minutes.leamspringframework.examples.b1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class ClassA {

}
@Component
@Lazy // 지연 초기, Bean을 사용할 때 초기화 됨
class ClassB {
    private ClassA classA;
    public ClassB(ClassA classA) {
        System.out.println("Some Initialization logic");
        this.classA = classA;
    }

    public void doSomething(){
        System.out.println("Do Something");
    }

}
@Configuration
@ComponentScan()
public class LazyInitializationLauncherApplication {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(LazyInitializationLauncherApplication.class);

        System.out.println("Initialzation of context is completed");
        context.getBean(ClassB.class).doSomething();  //  <-- 이때 초기

    }
}
