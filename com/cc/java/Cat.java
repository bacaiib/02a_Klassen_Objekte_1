package com.cc.java;

public class Cat {

    private String name;
    private String fellFarbe;
    private int alter;

    
    public Cat(String name, String fellFarbe, int alter) {
        this.name = name;
        this.fellFarbe = fellFarbe;
        this.alter = alter;
    }

    
    public String getName() {
        if (getPermission()) {
            return name;
        } else {
        return "Sorry, no premission!";
    }
}

    public void setName(String name) {
        this.name = name;
    }

    public String getFellFarbe() {
        return fellFarbe;
    }

    public void setFellFarbe(String fellFarbe) {
        this.fellFarbe = fellFarbe;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    private boolean getPermission() {
        return false;
    }

    // public void sayHall0(){
       
    //     System.out.println("Hello");
    // }

    // public void tellYourAddress(){

    //     System.out.println(this);

    }
    


