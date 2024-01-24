package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        // Objekt ensteht..
        Cat cat = new Cat(); // Instanziierung..
        System.out.println(cat);

        // cat.sayHall0();
        cat.tellYourAddress();

        System.out.println("------------------");

        Cat cat2 = new Cat();
        System.out.println(cat2);
        cat2.tellYourAddress();



    }

   

}

