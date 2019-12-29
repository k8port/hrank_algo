package com.udemy.oop.lifeorganizedtaxonomically.eubacterialdomain;

import com.udemy.oop.taxonomicalstructuresandcharacteristics.Domain;

public class EubacteriaDomain implements Domain {
    public EubacteriaDomain() {
        this.kingdoms.add(new EubacteriaKingdom());
    }
}
