/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springdemo;

import java.util.List;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 *
 * @author SantoshPC
 */
public class TriangleData implements ApplicationContextAware ,BeanNameAware{

    private Pointer PointA;
    private Pointer PointB;    
    private Pointer PointC;
    ApplicationContext comtext = null;

    List <Pointer> list ;

    public List<Pointer> getList() {
        return list;
    }

    public void setList(List<Pointer> list) {
        this.list = list;
    }
    
    void drawListPinters() {
        for (Pointer pointer : list) {
           System.out.println("Collection Point : X : "+pointer.getX()+" Y : "+pointer.getY());
        }
    }

    
    
    
    public Pointer getPointA() {
        return PointA;
    }

    public void setPointA(Pointer PointA) {
        this.PointA = PointA;
    }

    public Pointer getPointB() {
        return PointB;
    }

    public void setPointB(Pointer PointB) {
        this.PointB = PointB;
    }

    public Pointer getPointC() {
        return PointC;
    }

    public void setPointC(Pointer PointC) {
        this.PointC = PointC;
    }

    
    
    
    void drawPinters() {
            System.out.println("Refrence Beans Point A : X : "+getPointA().getX()+" Y : "+ getPointA().getY()+"  Point B X : "+getPointB().getX()+" Y : "+getPointB().getY()+" Point C X : "+getPointC().getX()+" Y : "+getPointC().getY());
    }

    @Override
    public void setApplicationContext(ApplicationContext ac) throws BeansException {
        this.comtext= ac;
    }

    @Override
    public void setBeanName(String string) {
        System.out.println("Bean Name is  "+string);
    }

   
    
}
