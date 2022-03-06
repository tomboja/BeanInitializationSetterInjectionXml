package edu.miu.cs544.temesgen;

import edu.miu.cs544.temesgen.service.Game;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ProjectName: BeanInitializationSetterInjectionXml
 * @Author: Temesgen D.
 * @Date: 3/6/22
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Start...");
        System.out.println();
        ApplicationContext springContext = new ClassPathXmlApplicationContext("config.xml");

        Game game = springContext.getBean(Game.class);
        game.play();
        System.out.println();
        System.out.println("===Vehicle info===");
        System.out.println(game.getVehicle());

        System.out.println();
        System.out.println("End...");
    }
}
