package com.udemy.oop.lifeorganizedtaxonomically.eukaryoticdomain.animaliakingdom.chordataphylum.vertebrates.mammalia.theria.eutheria.primates.hominidae.homininae.gorillini.gorilla.gorilla;

import com.udemy.oop.taxonomicalstructuresandcharacteristics.typing.SpeciesTypeHierarchy;

import static com.udemy.oop.taxonomicalstructuresandcharacteristics.typing.SpeciesTypeHierarchy.SUBSPECIES;

public enum GorillaGorillaSubspecies {
    GORILLA(SUBSPECIES, "Western Lowland"),
    DIEHLI(SUBSPECIES, "Cross River");

    private SpeciesTypeHierarchy type;
    private String commonName;

    GorillaGorillaSubspecies(SpeciesTypeHierarchy speciesType, String commonName) {
        if (commonName.equals(null)) {
            this.commonName = "";
        }
        this.commonName = commonName;
        this.type = speciesType;
    }
}
