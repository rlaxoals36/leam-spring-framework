package com.in28minutes.leamspringframework;

import com.in28minutes.leamspringframework.game.GameRunner;
import com.in28minutes.leamspringframework.game.GamingConsole;
import com.in28minutes.leamspringframework.game.MarioGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.in28minutes.leamspringframework.game")
public class App03GamingSpringBeans {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(App03GamingSpringBeans.class);
        context.getBean(GamingConsole.class).up();
        context.getBean(GameRunner.class).run();

    }
}
