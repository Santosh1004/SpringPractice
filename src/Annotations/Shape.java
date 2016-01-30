/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Annotations;

import org.springframework.beans.factory.annotation.Required;

/**
 *
 * @author SantoshPC
 */
public class Shape implements Drawer{
    
    private Point center;

    public Point getCenter() {
        return center;
    }

    @Required
    public void setCenter(Point center) {
        this.center = center;
    }
        
   
    @Override
    public void drawShape() {
         System.out.println("Draw Shape : "+getCenter().getX()+" And "+getCenter().getY());
    }
}
