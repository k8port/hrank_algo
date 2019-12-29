package com.udemy.oop.lifeorganizedtaxonomically.eukaryoticdomain.animaliakingdom.chordataphylum.vertebrates.mammalia.theria.eutheria.ordersubtypesofeutheria.boroeutheria.euarchontoglires.euarchonta.primatorpha;

import com.udemy.oop.taxonomicalstructuresandcharacteristics.typing.OrderSubclassTypeEnum;

import static com.udemy.oop.taxonomicalstructuresandcharacteristics.typing.OrderSubclassTypeEnum.ORDER;

public enum PrimatorphaClade {
    DERMOPTERA(ORDER),
    PRIMATES(ORDER);

    OrderSubclassTypeEnum subclass;

    PrimatorphaClade(OrderSubclassTypeEnum subclass) {
        this.subclass = subclass;
    }
}
