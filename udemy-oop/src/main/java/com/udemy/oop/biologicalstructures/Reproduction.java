package com.udemy.oop.biologicalstructures;

public enum Reproduction {
    SEXUAL("mitosis and meiosis"),
    ASEXUAL("meiosis");
    private final String methods;

    Reproduction(String methods) {
        this.methods = methods;
    }
}
