package com.udemy.oop.lifeorganizedtaxonomically.eukaryoticdomain.animaliakingdom.chordataphylum.vertebrates.mammalia.theria.eutheria.primates.hominidae.homininae.gorillini.gorilla.beringei;

import com.udemy.oop.taxonomicalstructuresandcharacteristics.typing.SpeciesTypeHierarchy;

import static com.udemy.oop.taxonomicalstructuresandcharacteristics.typing.SpeciesTypeHierarchy.SUBSPECIES;

public enum GorillaBeringeiSubspecies {
    BERINGEI(SUBSPECIES, "Mountain"),
    GRAUERI(SUBSPECIES, "Eastern Lowland");

    private SpeciesTypeHierarchy type;
    private String commonName;

    GorillaBeringeiSubspecies(SpeciesTypeHierarchy speciesType, String commonName) {
        if (commonName.equals(null)) {
            this.commonName = "";
        }
        this.commonName = commonName;
        this.type = speciesType;
    }
}
