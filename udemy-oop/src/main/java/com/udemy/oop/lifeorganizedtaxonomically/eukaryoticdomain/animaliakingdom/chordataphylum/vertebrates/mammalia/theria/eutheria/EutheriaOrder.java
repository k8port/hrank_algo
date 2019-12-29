package com.udemy.oop.lifeorganizedtaxonomically.eukaryoticdomain.animaliakingdom.chordataphylum.vertebrates.mammalia.theria.eutheria;

import com.udemy.oop.taxonomicalstructuresandcharacteristics.typing.OrderSubclassTypeEnum;

import static com.udemy.oop.taxonomicalstructuresandcharacteristics.typing.OrderSubclassTypeEnum.CLADE;

public enum EutheriaOrder {
    ATLANTOGENATA(CLADE),
    BOROEUTHERIA(CLADE);

    OrderSubclassTypeEnum subclass;

    EutheriaOrder(OrderSubclassTypeEnum subclass) {
        this.subclass = subclass;
    }
}
