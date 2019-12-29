package com.udemy.oop.lifeorganizedtaxonomically.eukaryoticdomain.animaliakingdom.chordataphylum.vertebrates.mammalia.theria.eutheria.primates.hominidae.ponginae.pongini.pongo;

import com.udemy.oop.taxonomicalstructuresandcharacteristics.typing.MajorSubtypesEnum;

import static com.udemy.oop.taxonomicalstructuresandcharacteristics.typing.MajorSubtypesEnum.SPECIES;

public enum PongoGenus {
    PYGMAEUS(SPECIES, "Bornean"),
    ABELII(SPECIES, "Sumatran"),
    TAPANULIENSIS(SPECIES, "Tapenuli");

    private MajorSubtypesEnum subtype;
    private String commonName;


    PongoGenus(MajorSubtypesEnum subtype, String commonName) {
        if (!commonName.equals(null)) {
            this.commonName = commonName;
        }
        this.subtype = subtype;
    }
}
