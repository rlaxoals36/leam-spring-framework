package com.in28minutes.leamspringframework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContraGameQualifier")
public class SuperContraGame implements GamingConsole {
    public void up(){
        System.out.println("Up");
    }
    public void down(){
        System.out.println("Sit down");
    }
    public void rigth(){
        System.out.println("Go back");
    }
    public void left(){
        System.out.println("Shoot a bullet");
    }
}
