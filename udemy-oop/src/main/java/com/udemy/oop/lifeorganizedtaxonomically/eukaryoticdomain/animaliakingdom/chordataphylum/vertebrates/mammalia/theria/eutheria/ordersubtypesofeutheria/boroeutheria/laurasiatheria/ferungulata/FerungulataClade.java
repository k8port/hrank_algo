package com.udemy.oop.lifeorganizedtaxonomically.eukaryoticdomain.animaliakingdom.chordataphylum.vertebrates.mammalia.theria.eutheria.ordersubtypesofeutheria.boroeutheria.laurasiatheria.ferungulata;

import com.udemy.oop.taxonomicalstructuresandcharacteristics.typing.OrderSubclassTypeEnum;

import static com.udemy.oop.taxonomicalstructuresandcharacteristics.typing.OrderSubclassTypeEnum.*;

public enum FerungulataClade {
    CETARTIODACTYLA(COHORT),
    PEGASOFERAE(CLADE);

    OrderSubclassTypeEnum subclass;

    FerungulataClade(OrderSubclassTypeEnum subclass) {
        this.subclass = subclass;
    }
}
