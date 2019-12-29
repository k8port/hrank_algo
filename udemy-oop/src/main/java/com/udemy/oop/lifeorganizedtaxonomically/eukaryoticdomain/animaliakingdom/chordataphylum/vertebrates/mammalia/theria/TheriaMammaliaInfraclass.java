package com.udemy.oop.lifeorganizedtaxonomically.eukaryoticdomain.animaliakingdom.chordataphylum.vertebrates.mammalia.theria;

public enum TheriaMammaliaInfraclass {
    METATHERIA("marsupials"),
    EUTHERIA("placentals");

    private String definition;

    TheriaMammaliaInfraclass(String definition) {
        this.definition = definition;
    }
}
