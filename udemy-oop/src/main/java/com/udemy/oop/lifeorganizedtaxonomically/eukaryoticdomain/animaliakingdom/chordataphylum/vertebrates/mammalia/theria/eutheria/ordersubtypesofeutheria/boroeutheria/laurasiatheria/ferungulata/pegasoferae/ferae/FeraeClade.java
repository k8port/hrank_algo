package com.udemy.oop.lifeorganizedtaxonomically.eukaryoticdomain.animaliakingdom.chordataphylum.vertebrates.mammalia.theria.eutheria.ordersubtypesofeutheria.boroeutheria.laurasiatheria.ferungulata.pegasoferae.ferae;

import com.udemy.oop.taxonomicalstructuresandcharacteristics.typing.OrderSubclassTypeEnum;

import static com.udemy.oop.taxonomicalstructuresandcharacteristics.typing.OrderSubclassTypeEnum.ORDER;

public enum FeraeClade {
    PHOLIDOTA(ORDER),
    CARNIVORA(ORDER);

    OrderSubclassTypeEnum subclass;

    FeraeClade(OrderSubclassTypeEnum subclass) {
        this.subclass = subclass;
    }
}
