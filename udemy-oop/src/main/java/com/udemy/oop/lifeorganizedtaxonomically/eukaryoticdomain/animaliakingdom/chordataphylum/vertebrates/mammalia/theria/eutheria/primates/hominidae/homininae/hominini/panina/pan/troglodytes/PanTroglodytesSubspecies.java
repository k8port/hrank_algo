package com.udemy.oop.lifeorganizedtaxonomically.eukaryoticdomain.animaliakingdom.chordataphylum.vertebrates.mammalia.theria.eutheria.primates.hominidae.homininae.hominini.panina.pan.troglodytes;

import com.udemy.oop.taxonomicalstructuresandcharacteristics.typing.SpeciesTypeHierarchy;

import static com.udemy.oop.taxonomicalstructuresandcharacteristics.typing.SpeciesTypeHierarchy.SUBSPECIES;

public enum PanTroglodytesSubspecies {
    TROGLODYTES(SUBSPECIES, "Central Chimpanzee"),
    VERUS(SUBSPECIES, "Western Chimpanzee"),
    ELLIOTI(SUBSPECIES, "Nigeria-Cameroon Chimpanzee"),
    SCHWEINFURTHII(SUBSPECIES, "Eastern Chimpanzee");

    private SpeciesTypeHierarchy type;
    private String commonName;

    PanTroglodytesSubspecies(SpeciesTypeHierarchy speciesType, String commonName) {
        if (commonName.equals(null)) {
            this.commonName = "";
        }
        this.commonName = commonName;
        this.type = speciesType;
    }
}
