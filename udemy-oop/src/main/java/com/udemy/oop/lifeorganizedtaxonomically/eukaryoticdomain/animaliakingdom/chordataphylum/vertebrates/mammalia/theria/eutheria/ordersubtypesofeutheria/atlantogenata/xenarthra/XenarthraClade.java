package com.udemy.oop.lifeorganizedtaxonomically.eukaryoticdomain.animaliakingdom.chordataphylum.vertebrates.mammalia.theria.eutheria.ordersubtypesofeutheria.atlantogenata.xenarthra;

import com.udemy.oop.taxonomicalstructuresandcharacteristics.typing.OrderSubclassTypeEnum;

import static com.udemy.oop.taxonomicalstructuresandcharacteristics.typing.OrderSubclassTypeEnum.ORDER;

public enum XenarthraClade {
    CINGULATA(ORDER),
    PILOSA(ORDER);

    OrderSubclassTypeEnum subclass;

    XenarthraClade(OrderSubclassTypeEnum subclass) {
        this.subclass = subclass;
    }

}
