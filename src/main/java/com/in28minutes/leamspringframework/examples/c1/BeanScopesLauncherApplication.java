package com.in28minutes.leamspringframework.examples.c1;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
class NormalClass { // 기본은 싱글톤

}

@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE) // 참조할때마다 다른 인스턴스를 생성
@Component
class PrototypeClass {

}


@Configuration
@ComponentScan()
public class BeanScopesLauncherApplication {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(BeanScopesLauncherApplication.class);

        System.out.println(context.getBean(NormalClass.class));
        System.out.println(context.getBean(NormalClass.class));
        System.out.println(context.getBean(NormalClass.class));
        System.out.println(context.getBean(NormalClass.class));

        System.out.println(context.getBean(PrototypeClass.class));
        System.out.println(context.getBean(PrototypeClass.class));
        System.out.println(context.getBean(PrototypeClass.class));



    }
}
