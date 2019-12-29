package com.udemy.oop.lifeorganizedtaxonomically.eukaryoticdomain.animaliakingdom.chordataphylum.vertebrates.mammalia.theria.eutheria.primates.hominidae.homininae.hominini.panina;

import com.udemy.oop.taxonomicalstructuresandcharacteristics.typing.MajorSubtypesEnum;

import static com.udemy.oop.taxonomicalstructuresandcharacteristics.typing.MajorSubtypesEnum.GENUS;

public enum PaninaSubtribe {
    PAN(GENUS);

    private MajorSubtypesEnum subtype;

    PaninaSubtribe(MajorSubtypesEnum subtype) {
        this.subtype = subtype;
    }
}
