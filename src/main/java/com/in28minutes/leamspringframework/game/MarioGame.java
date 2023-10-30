package com.in28minutes.leamspringframework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MarioGame implements GamingConsole {

    public void up(){
        System.out.println("Up");
    }
    public void down(){
        System.out.println("Down");
    }
    public void rigth(){
        System.out.println("Rigth");
    }
    public void left(){
        System.out.println("Left");
    }
}
