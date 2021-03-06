/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springdemo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 *
 * @author SantoshPC
 */
public class Triangle implements InitializingBean, DisposableBean{

    private String type;
    private int height;
    
    public Triangle(String type) {
        this.type = type;
    }

    public Triangle(String type, int height) {
        this.type = type;
        this.height = height;
    }

    
    
    public int getHeight() {
        return height;
    }

    public Triangle(int height) {
        this.height = height;
    }
    
    
    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    
    public void draw(){
        System.out.println("I am in Triangle "+getType() +" HEIGHTS :"+getHeight());
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Bean Initialised ");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Bean Destroy .. ");
    }

    void myInt(){
        System.out.println("I am in Init method() ");
    }
    
    void cleanUp(){
        System.out.println("Clean up method called");
    }
}
