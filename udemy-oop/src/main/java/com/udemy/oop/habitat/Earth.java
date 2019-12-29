package com.udemy.oop.habitat;

import com.udemy.oop.Human;

public class Earth {
    public static void main(String[] args) {

        Human humanTom = new Human(5, "Tom", 42, "brown");
        Human humanJoe = new Human(32, "Joe", 70, "green");
        Human humanLynn = new Human(32, "Lynn", 63, "brown");

        humanTom.speak();
        humanJoe.speak();
        humanLynn.speak();
    }
}
