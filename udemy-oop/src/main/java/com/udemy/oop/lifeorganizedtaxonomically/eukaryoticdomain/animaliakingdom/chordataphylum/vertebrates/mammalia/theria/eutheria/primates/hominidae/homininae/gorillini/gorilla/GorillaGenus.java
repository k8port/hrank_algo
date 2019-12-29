package com.udemy.oop.lifeorganizedtaxonomically.eukaryoticdomain.animaliakingdom.chordataphylum.vertebrates.mammalia.theria.eutheria.primates.hominidae.homininae.gorillini.gorilla;

import com.udemy.oop.taxonomicalstructuresandcharacteristics.typing.MajorSubtypesEnum;

import static com.udemy.oop.taxonomicalstructuresandcharacteristics.typing.MajorSubtypesEnum.SPECIES;

public enum GorillaGenus {
    GORILLA(SPECIES, "Western"),
    BERINGEI(SPECIES, "Eastern");

    private MajorSubtypesEnum subtype;
    private String commonName;

    GorillaGenus(MajorSubtypesEnum subtype, String commonName) {
        if (!commonName.equals(null)) {
            this.commonName = null;
        }
        this.commonName = commonName;
        this.subtype = subtype;
    }
}
