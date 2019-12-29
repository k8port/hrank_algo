package com.udemy.oop.lifeorganizedtaxonomically.eukaryoticdomain.animaliakingdom.chordataphylum.vertebrates.mammalia.theria.eutheria.primates.hominidae.homininae.hominini.panina.pan;

import com.udemy.oop.taxonomicalstructuresandcharacteristics.typing.MajorSubtypesEnum;

import static com.udemy.oop.taxonomicalstructuresandcharacteristics.typing.MajorSubtypesEnum.SPECIES;

public enum PanGenus {
    TROGLODYTES(SPECIES, "chimpanzee"),
    PANISCUS(SPECIES, "bonobo");

    private MajorSubtypesEnum subtype;
    private String commonName;

    PanGenus(MajorSubtypesEnum subtype, String commonName) {
        if (!commonName.equals(null)) {
            this.commonName = null;
        }
        this.commonName = commonName;
        this.subtype = subtype;
    }
}
