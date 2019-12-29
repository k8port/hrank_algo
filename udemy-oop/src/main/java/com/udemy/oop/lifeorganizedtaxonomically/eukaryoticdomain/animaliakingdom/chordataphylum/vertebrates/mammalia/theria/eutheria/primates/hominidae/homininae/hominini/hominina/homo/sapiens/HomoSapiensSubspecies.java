package com.udemy.oop.lifeorganizedtaxonomically.eukaryoticdomain.animaliakingdom.chordataphylum.vertebrates.mammalia.theria.eutheria.primates.hominidae.homininae.hominini.hominina.homo.sapiens;

import com.udemy.oop.taxonomicalstructuresandcharacteristics.typing.SpeciesTypeHierarchy;

import static com.udemy.oop.taxonomicalstructuresandcharacteristics.typing.SpeciesTypeHierarchy.SUBSPECIES;

public enum HomoSapiensSubspecies {
    SAPIENS(SUBSPECIES, "Anatomically Modern Human");

    private SpeciesTypeHierarchy type;
    private String commonName;

    HomoSapiensSubspecies(SpeciesTypeHierarchy speciesType, String commonName) {
        if (commonName.equals(null)) {
            this.commonName = "";
        }
        this.commonName = commonName;
        this.type = speciesType;
    }
}
