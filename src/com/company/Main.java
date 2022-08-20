package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	 Animal[] animals = new Animal[]{new Shark(), new Turtle(), new Eagle()};
     Shark shark = new Shark();
        Object Shark = null;
        if (Shark instanceof Turtle)
            System.out.println();

     Turtle turtle = new Turtle();
     Eagle eagle = new Eagle();

     shark.attack();
     turtle.swim();
     eagle.fly();


    }

}
