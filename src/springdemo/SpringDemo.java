/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springdemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

/**
 *
 * @author SantoshPC
 */
public class SpringDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       // Bean Factory Declaration
       // BeanFactory factory = new XmlBeanFactory(new FileSystemResource("Spring.xml"));
       // ApplicationContext Factory Declaration
       ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
       
       
//      Refrence
       TriangleData newobj = (TriangleData) context.getBean("newTraingle");
       newobj.drawPinters();
       
//       collection
       TriangleData collectionobj = (TriangleData) context.getBean("CollectionTraingle");
       collectionobj.drawListPinters();
       
//      Wiring    
       WiringTest wire = (WiringTest) context.getBean("Student");
       wire.getStudentData();
       
//      inheritance
       
       System.out.println("Inheritance ");
       TriangleData obj1 = (TriangleData) context.getBean("Triangle1");
       obj1.drawPinters();
       
       Triangle obj = (Triangle) context.getBean("traingle");
       obj.draw();
       
    }
    
}
