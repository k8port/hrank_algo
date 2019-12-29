package com.udemy.oop.lifeorganizedtaxonomically.eukaryoticdomain.animaliakingdom.chordataphylum.vertebrates.mammalia.theria.eutheria.ordersubtypesofeutheria.atlantogenata.xenarthra.pilosa;

import com.udemy.oop.taxonomicalstructuresandcharacteristics.typing.OrderSubclassTypeEnum;

import static com.udemy.oop.taxonomicalstructuresandcharacteristics.typing.OrderSubclassTypeEnum.SUBORDER;

public enum PilosaOrder {
    VERMILINGUA(SUBORDER),
    FOLIVORA(SUBORDER);

    OrderSubclassTypeEnum subclass;

    PilosaOrder(OrderSubclassTypeEnum subclass) {
        this.subclass = subclass;
    }
}
