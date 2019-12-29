package com.udemy.oop.taxonomicalstructuresandcharacteristics;

import java.util.Set;
import java.util.TreeSet;

public class Species {
    private Genus genus;
    private String speciesName;
    Set<SubSpecies> subSpecies;

    Species() {
        subSpecies = new TreeSet<SubSpecies>();
    }

    Species(Genus genus, String name) {
        this.speciesName = name;
        this.genus = genus;
    }

    public String getTaxonomicalName() {
        return this.genus + " " + this.speciesName;
    }
}
