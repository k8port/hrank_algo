package com.udemy.oop.lifeorganizedtaxonomically.eukaryoticdomain.animaliakingdom.chordataphylum.vertebrates.mammalia.theria.eutheria.ordersubtypesofeutheria.boroeutheria.laurasiatheria;

import com.udemy.oop.taxonomicalstructuresandcharacteristics.typing.OrderSubclassTypeEnum;

import static com.udemy.oop.taxonomicalstructuresandcharacteristics.typing.OrderSubclassTypeEnum.CLADE;
import static com.udemy.oop.taxonomicalstructuresandcharacteristics.typing.OrderSubclassTypeEnum.ORDER;

public enum LaurasiatheriaClade {
    EULIPOTYPHLA(ORDER),
    FERUNGULATA(CLADE);

    OrderSubclassTypeEnum subclass;

    LaurasiatheriaClade(OrderSubclassTypeEnum subclass) {
        this.subclass = subclass;
    }
}
