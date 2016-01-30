/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import springdemo.TriangleData;

/**
 *
 * @author SantoshPC
 */
public class AnnotationExample {
    
    public static void main(String args[]){
       ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
      
       Shape newobj = (Shape) context.getBean("circle");
       newobj.drawShape();
      
    }
            
}
