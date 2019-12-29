package com.udemy.oop.lifeorganizedtaxonomically.eukaryoticdomain.animaliakingdom.chordataphylum.vertebrates.mammalia.theria.eutheria.ordersubtypesofeutheria.boroeutheria;

import com.udemy.oop.taxonomicalstructuresandcharacteristics.typing.OrderSubclassTypeEnum;

import static com.udemy.oop.taxonomicalstructuresandcharacteristics.typing.OrderSubclassTypeEnum.CLADE;

public enum BoroeutheriaClade {
    EUARCHONTOGLIRES(CLADE),
    LAURASIATHERIA(CLADE);

    OrderSubclassTypeEnum subclass;

    BoroeutheriaClade(OrderSubclassTypeEnum subclass) {
        this.subclass = subclass;
    }
}
