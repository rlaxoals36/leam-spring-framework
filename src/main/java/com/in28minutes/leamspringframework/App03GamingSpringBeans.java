package com.in28minutes.leamspringframework;

import com.in28minutes.leamspringframework.game.GameRunner;
import com.in28minutes.leamspringframework.game.GamingConsole;
import com.in28minutes.leamspringframework.game.MarioGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingSpringBeans {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(GamingConfiguration.class);
        context.getBean(GamingConsole.class).up();
        context.getBean(GameRunner.class).run();

    }
}
