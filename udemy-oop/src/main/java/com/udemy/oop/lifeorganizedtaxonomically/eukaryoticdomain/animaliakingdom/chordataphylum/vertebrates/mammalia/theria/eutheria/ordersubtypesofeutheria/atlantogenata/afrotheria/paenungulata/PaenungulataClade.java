package com.udemy.oop.lifeorganizedtaxonomically.eukaryoticdomain.animaliakingdom.chordataphylum.vertebrates.mammalia.theria.eutheria.ordersubtypesofeutheria.atlantogenata.afrotheria.paenungulata;

import com.udemy.oop.taxonomicalstructuresandcharacteristics.typing.OrderSubclassTypeEnum;

import static com.udemy.oop.taxonomicalstructuresandcharacteristics.typing.OrderSubclassTypeEnum.ORDER;

public enum PaenungulataClade {
    PROBOSCIDEA(ORDER),
    HYRACOIDEA(ORDER),
    SIRENIA(ORDER);

    OrderSubclassTypeEnum subclass;

    PaenungulataClade(OrderSubclassTypeEnum subclass) {
        this.subclass = subclass;
    }
}
