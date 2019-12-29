package com.udemy.oop.lifeorganizedtaxonomically.eukaryoticdomain.animaliakingdom.chordataphylum.vertebrates.mammalia.theria.eutheria.ordersubtypesofeutheria.boroeutheria.euarchontoglires.glires;


import com.udemy.oop.taxonomicalstructuresandcharacteristics.typing.OrderSubclassTypeEnum;

import static com.udemy.oop.taxonomicalstructuresandcharacteristics.typing.OrderSubclassTypeEnum.ORDER;

public enum  GliresSuperorder {
    LAGOMORPHA(ORDER),
    RODENTIA(ORDER);

    OrderSubclassTypeEnum subclass;

    GliresSuperorder(OrderSubclassTypeEnum subclass) {
        this.subclass = subclass;
    }
}
