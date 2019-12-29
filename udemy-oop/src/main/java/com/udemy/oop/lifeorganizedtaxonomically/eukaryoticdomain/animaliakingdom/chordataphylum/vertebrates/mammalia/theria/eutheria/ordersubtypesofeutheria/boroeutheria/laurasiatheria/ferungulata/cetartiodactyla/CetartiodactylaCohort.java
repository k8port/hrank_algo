package com.udemy.oop.lifeorganizedtaxonomically.eukaryoticdomain.animaliakingdom.chordataphylum.vertebrates.mammalia.theria.eutheria.ordersubtypesofeutheria.boroeutheria.laurasiatheria.ferungulata.cetartiodactyla;

import com.udemy.oop.taxonomicalstructuresandcharacteristics.typing.OrderSubclassTypeEnum;

import static com.udemy.oop.taxonomicalstructuresandcharacteristics.typing.OrderSubclassTypeEnum.ORDER;

public enum CetartiodactylaCohort {
    ARTIODACTYLA(ORDER),
    CETACEA(ORDER);

    OrderSubclassTypeEnum subclass;

    CetartiodactylaCohort(OrderSubclassTypeEnum subclass) {
        this.subclass = subclass;
    }
}
