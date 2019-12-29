package com.udemy.oop.lifeorganizedtaxonomically.eukaryoticdomain.animaliakingdom.chordataphylum.vertebrates.mammalia.theria.eutheria.primates.hominidae.homininae.gorillini;

import com.udemy.oop.taxonomicalstructuresandcharacteristics.typing.MajorSubtypesEnum;

import static com.udemy.oop.taxonomicalstructuresandcharacteristics.typing.MajorSubtypesEnum.GENUS;

public enum GorilliniTribe {
    GORILLA(GENUS);

    private MajorSubtypesEnum subtype;

    GorilliniTribe(MajorSubtypesEnum subtype) {
        this.subtype = subtype;
    }
}
