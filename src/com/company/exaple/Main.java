package com.company.exaple;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        // write your code here


        Cat myCat = new Cat("Bradly", "Captain", 4, 'm', "Lyndon",  true, 13.3);

        System.out.println("the name of my dog is: " + myCat.getPetName());


        myCat.setWhiskers(false);
        System.out.println("Does my dog have whiskers? " + myCat.isWhiskers());

        System.out.println(myCat.makeSound());


    }

}