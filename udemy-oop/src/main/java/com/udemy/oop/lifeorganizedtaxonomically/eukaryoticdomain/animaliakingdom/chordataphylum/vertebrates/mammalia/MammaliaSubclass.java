package com.udemy.oop.lifeorganizedtaxonomically.eukaryoticdomain.animaliakingdom.chordataphylum.vertebrates.mammalia;

public enum MammaliaSubclass {
    PROTOTHERIA("egg-laying mammals"),
    THERIA("true mammals");

    private String definition;

    MammaliaSubclass(String definition) {
        this.definition = definition;
    }
}
