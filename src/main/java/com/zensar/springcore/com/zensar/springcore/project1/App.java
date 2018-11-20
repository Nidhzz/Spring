package com.zensar.springcore.com.zensar.springcore.project1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
       /* Student student=(Student)context.getBean("student");
        System.out.println("STUDENT "+student);
        Student student2=(Student)context.getBean("student2");
        System.out.println("STUDENT 2 "+student2);*/
        
        /*Student student5=(Student)context.getBean("student5");
        System.out.println("STUDENT 2 "+student5);
        
        Student student6=(Student)context.getBean("student6");
        System.out.println("STUDENT 2 "+student6);*/
        
        Student student7=(Student)context.getBean("student7");
        System.out.println("STUDENT 2 "+student7);
        
        
        Student student8=(Student)context.getBean("student8");
        System.out.println("STUDENT 2 "+student8);
        
        Student student10=(Student)context.getBean("student10");
        System.out.println("STUDENT 2 "+student10);
        
    }
}
