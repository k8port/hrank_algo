package com.udemy.oop.lifeorganizedtaxonomically.eukaryoticdomain.animaliakingdom.chordataphylum.vertebrates.mammalia.theria.eutheria.primates.hominidae.homininae.hominini.hominina;

import com.udemy.oop.taxonomicalstructuresandcharacteristics.typing.MajorSubtypesEnum;

import static com.udemy.oop.taxonomicalstructuresandcharacteristics.typing.MajorSubtypesEnum.GENUS;

public enum HomininaSubtribe {
    HOMO(GENUS);

    private MajorSubtypesEnum subtype;

    HomininaSubtribe(MajorSubtypesEnum subtype) {
        this.subtype = subtype;
    }
}
