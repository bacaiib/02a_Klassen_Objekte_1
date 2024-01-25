package com.cc.java;

public class Cat {

    String name;
    String fellFarbe;
    int alter;

    
    public Cat(String name, String fellFarbe, int alter) {
        this.name = name;
        this.fellFarbe = fellFarbe;
        this.alter = alter;
    }

    public String tellYourName(){
        return this.name;
        //System.out.println(name);
    }

    public String tellYourFellFarbe(){
        return this.fellFarbe;
    }

    public int tellYourAge(){
        return this.alter;
    }
    public void sayHall0(){
       
        System.out.println("Hello");
    }

    public void tellYourAddress(){

        System.out.println(this);

    }
    

}
