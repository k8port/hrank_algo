package com.udemy.oop.lifeorganizedtaxonomically.eukaryoticdomain.animaliakingdom.chordataphylum.vertebrates.mammalia.theria.eutheria.ordersubtypesofeutheria.atlantogenata.afrotheria;

import com.udemy.oop.taxonomicalstructuresandcharacteristics.typing.OrderSubclassTypeEnum;

import static com.udemy.oop.taxonomicalstructuresandcharacteristics.typing.OrderSubclassTypeEnum.CLADE;

public enum AfrotheriaClade {
    AFROINSECTIPHILIA(CLADE),
    PAENUNGULATA(CLADE);

    OrderSubclassTypeEnum subclass;

    AfrotheriaClade(OrderSubclassTypeEnum subclass) {
        this.subclass = subclass;
    }
}
