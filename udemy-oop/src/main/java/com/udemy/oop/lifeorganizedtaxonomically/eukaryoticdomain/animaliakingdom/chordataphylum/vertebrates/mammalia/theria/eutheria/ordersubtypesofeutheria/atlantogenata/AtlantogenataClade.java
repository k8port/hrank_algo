package com.udemy.oop.lifeorganizedtaxonomically.eukaryoticdomain.animaliakingdom.chordataphylum.vertebrates.mammalia.theria.eutheria.ordersubtypesofeutheria.atlantogenata;

import com.udemy.oop.taxonomicalstructuresandcharacteristics.typing.OrderSubclassTypeEnum;

import static com.udemy.oop.taxonomicalstructuresandcharacteristics.typing.OrderSubclassTypeEnum.CLADE;
import static com.udemy.oop.taxonomicalstructuresandcharacteristics.typing.OrderSubclassTypeEnum.SUPERORDER;

public enum AtlantogenataClade {
    AFROTHERIA(CLADE),
    XENARTHRA(SUPERORDER);

    OrderSubclassTypeEnum subclass;

    AtlantogenataClade(OrderSubclassTypeEnum subclass) {
        this.subclass = subclass;
    }
}
