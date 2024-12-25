package org.Ritik;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args)
    {
        //we can use annotations here this is not a spring project yet as we have not added spring dependency
//        Animal a = new Animal();
//        a.Type();

        // here we have added spring dependency and got the IOC container(doing all the thinsg with xml which can be done using annotation)
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Animal ani = context.getBean(Animal.class);
//        ani.four();

        //Printing Dog's Sound from IOC(techinique) container
        Dog d = context.getBean(Dog.class);
        System.out.println(d.getAge());
        d.sound();


    }
}
