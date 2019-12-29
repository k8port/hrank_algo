package com.udemy.oop.lifeorganizedtaxonomically.eukaryoticdomain.animaliakingdom.chordataphylum.vertebrates.mammalia.theria.eutheria.primates;

import com.udemy.oop.taxonomicalstructuresandcharacteristics.typing.MajorSubtypesEnum;

import static com.udemy.oop.taxonomicalstructuresandcharacteristics.typing.MajorSubtypesEnum.FAMILY;

public enum PrimatesOrder {
    CHEIROGALEIDAE(FAMILY),
    LEMURIDAE(FAMILY),
    LEPILEMURIDAE(FAMILY),
    INDRIIDAE(FAMILY),
    DAUBENTONIIDAE(FAMILY),
    LORISIDAE(FAMILY),
    GALAGIDAE(FAMILY),
    TARSIIDAE(FAMILY),
    CALLITRICHIDAE(FAMILY),
    CEBIDAE(FAMILY),
    CERCOPITHECIDAE(FAMILY),
    HYLOBATIDAE(FAMILY),
    HOMINIDAE(FAMILY);

    private MajorSubtypesEnum majorSubtype;

    PrimatesOrder(MajorSubtypesEnum majorSubtype) {
        this.majorSubtype = majorSubtype;
    }
}
