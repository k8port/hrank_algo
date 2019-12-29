package com.udemy.oop.lifeorganizedtaxonomically.eukaryoticdomain.animaliakingdom.chordataphylum.vertebrates.mammalia.theria.eutheria.ordersubtypesofeutheria.atlantogenata.afrotheria.afroinsectiphilia;

import com.udemy.oop.taxonomicalstructuresandcharacteristics.typing.OrderSubclassTypeEnum;

import static com.udemy.oop.taxonomicalstructuresandcharacteristics.typing.OrderSubclassTypeEnum.ORDER;

public enum AfroinsectiphiliaClade {
    MACROSCELIDEA(ORDER),
    AFROSORICIDA(ORDER),
    TUBULIDENTATA(ORDER);

    OrderSubclassTypeEnum subclass;

    AfroinsectiphiliaClade(OrderSubclassTypeEnum subclass) {
        this.subclass = subclass;
    }
}
