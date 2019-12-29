package com.udemy.oop.lifeorganizedtaxonomically.eukaryoticdomain.animaliakingdom.chordataphylum.vertebrates.mammalia.theria.eutheria.ordersubtypesofeutheria.boroeutheria.euarchontoglires;

import com.udemy.oop.taxonomicalstructuresandcharacteristics.typing.OrderSubclassTypeEnum;

import static com.udemy.oop.taxonomicalstructuresandcharacteristics.typing.OrderSubclassTypeEnum.SUPERORDER;

public enum EuarchontogliresClade {
    Euarchonta(SUPERORDER),
    GLIRES(SUPERORDER);

    OrderSubclassTypeEnum subclass;

    EuarchontogliresClade(OrderSubclassTypeEnum subclass) {
        this.subclass = subclass;
    }
}
