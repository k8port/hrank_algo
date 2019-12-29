package com.udemy.oop.lifeorganizedtaxonomically.eukaryoticdomain.animaliakingdom.chordataphylum.vertebrates.mammalia.theria.eutheria.primates.hominidae.ponginae.pongini;

import com.udemy.oop.taxonomicalstructuresandcharacteristics.typing.MajorSubtypesEnum;

public enum PonginiTribe {
    PONGO(MajorSubtypesEnum.GENUS);

    private MajorSubtypesEnum subtype;

    PonginiTribe(MajorSubtypesEnum subtype) {
        this.subtype = subtype;
    }
}
