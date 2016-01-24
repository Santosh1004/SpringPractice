/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springdemo;

/**
 *
 * @author SantoshPC
 */
public class WiringTest {
    
    private wiringStudentClass Student1;
    private wiringStudentClass Student2;

    public wiringStudentClass getStudent1() {
        return Student1;
    }

    public void setStudent1(wiringStudentClass Student1) {
        this.Student1 = Student1;
    }

    public wiringStudentClass getStudent2() {
        return Student2;
    }

    public void setStudent2(wiringStudentClass Student2) {
        this.Student2 = Student2;
    }

   
    
void getStudentData(){
    System.out.println("Student Name : "+getStudent1().getName()+ " Address : "+getStudent1().getAddress()+ " Contact : "+getStudent1().getContact());
   System.out.println("Student Name : "+getStudent2().getName()+ " Address : "+getStudent2().getAddress()+ " Contact : "+getStudent2().getContact());
}    
    
    
}
