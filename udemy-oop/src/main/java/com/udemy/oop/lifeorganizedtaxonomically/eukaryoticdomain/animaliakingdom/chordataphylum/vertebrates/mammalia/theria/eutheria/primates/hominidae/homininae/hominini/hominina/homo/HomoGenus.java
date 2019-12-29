package com.udemy.oop.lifeorganizedtaxonomically.eukaryoticdomain.animaliakingdom.chordataphylum.vertebrates.mammalia.theria.eutheria.primates.hominidae.homininae.hominini.hominina.homo;

import com.udemy.oop.taxonomicalstructuresandcharacteristics.typing.MajorSubtypesEnum;

import static com.udemy.oop.taxonomicalstructuresandcharacteristics.typing.MajorSubtypesEnum.SPECIES;

public enum HomoGenus {
    SAPIENS(SPECIES, "Human");

    private MajorSubtypesEnum subtype;
    private String commonName;

    HomoGenus(MajorSubtypesEnum subtype, String commonName) {
        if (!commonName.equals(null)) {
            this.commonName = null;
        }
        this.commonName = commonName;
        this.subtype = subtype;
    }
}
