package oop.Encapsulation;

import oop.Inheritance.abstractt.Interfaces;

import java.awt.print.PrinterGraphics;

public class People {
    private int ssn;
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 0){
         this.age = 0;
        }else{
            this.age =age;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSsn() {
        return "Restricted";
    }

    public void setSsn(int ssn) {
        String ssid = Integer.toString(ssn);
        if(ssid.length() == 9){
            this.ssn = ssn;
            System.out.println("SSID set successfully");
        } else {
            System.out.println("Invalid SSID");
        }
    }
}
