package com.udemy.oop.lifeorganizedtaxonomically.eukaryoticdomain.animaliakingdom.chordataphylum.vertebrates.mammalia.theria.eutheria.ordersubtypesofeutheria.boroeutheria.laurasiatheria.ferungulata.pegasoferae;

import com.udemy.oop.taxonomicalstructuresandcharacteristics.typing.OrderSubclassTypeEnum;

import static com.udemy.oop.taxonomicalstructuresandcharacteristics.typing.OrderSubclassTypeEnum.ORDER;

public enum PegasoferaeClade {
    CHIROPTERA(ORDER),
    PERISSODACTYLA(ORDER),
    FERAE(ORDER);

    OrderSubclassTypeEnum subclass;

    PegasoferaeClade(OrderSubclassTypeEnum subclass) {
        this.subclass = subclass;
    }
}
