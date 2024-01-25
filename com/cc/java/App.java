package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        // Objekt ensteht..
        Cat cat = new Cat("Jasper", "gelb", 5); // Instanziierung..
        System.out.println(cat);
        // cat.name = "Peter";
        // cat.fellFarbe = "grau";
        // cat.alter = 9;

        // System.out.println(cat.tellYourName());
        // System.out.println(cat.tellYourFellFarbe());
        // System.out.println(cat.tellYourAge());
        
        // Ausgabe
        output(cat.getName());
        output(cat.getFellFarbe());
        output(String.valueOf(cat.getAlter()));

        // cat.tellYourAddress();
        // cat.tellYourName();

        // cat.sayHall0();
        // cat.tellYourAddress();

        output("------------------");

        // Ausgabe
        Cat cat2 = new Cat("Hans", "braun", 3);
        System.out.println(cat2);
        // cat.name = "Davi";
        // cat.fellFarbe = "pink";
        // cat.alter = 7;

        output(cat2.getName());
        output(cat2.getFellFarbe());
        output(Integer.toString(cat2.getAlter()));

    }

   public static void output(String outputStr){
        System.out.println(outputStr);
   }

}

