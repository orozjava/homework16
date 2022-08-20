package com.company;

public class Shark extends Animal{
    private String name;
    @Override
    public void animals(){
        System.out.println();
    }

    public void attack(){
        System.out.println("Акула");
    }

    public String getName() {
        return name;
    }
}
