package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        // Objekt ensteht..
        Cat cat = new Cat(); // Instanziierung..
        System.out.println(cat);
        cat.name = "Peter";
        cat.fellFarbe = "grau";
        cat.alter = 9;

        // System.out.println(cat.tellYourName());
        // System.out.println(cat.tellYourFellFarbe());
        // System.out.println(cat.tellYourAge());

        output(cat.tellYourName());
        output(cat.tellYourFellFarbe());
        output(Integer.toString(cat.tellYourAge()));

        // cat.tellYourAddress();
        // cat.tellYourName();

        // cat.sayHall0();
        // cat.tellYourAddress();

        output("------------------");

        Cat cat2 = new Cat();
        System.out.println(cat2);
        cat.name = "Davi";
        cat.fellFarbe = "schwul";
        cat.alter = 7;

        output(cat.tellYourName());
        output(cat.tellYourFellFarbe());
        output(Integer.toString(cat.tellYourAge()));

    }

   public static void output(String outputStr){
        System.out.println(outputStr);
   }

}

