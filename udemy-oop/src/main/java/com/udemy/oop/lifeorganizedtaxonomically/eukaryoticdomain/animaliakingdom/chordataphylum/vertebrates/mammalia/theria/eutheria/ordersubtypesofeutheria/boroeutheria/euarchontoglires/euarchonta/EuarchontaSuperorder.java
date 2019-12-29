package com.udemy.oop.lifeorganizedtaxonomically.eukaryoticdomain.animaliakingdom.chordataphylum.vertebrates.mammalia.theria.eutheria.ordersubtypesofeutheria.boroeutheria.euarchontoglires.euarchonta;

import com.udemy.oop.taxonomicalstructuresandcharacteristics.typing.OrderSubclassTypeEnum;

import static com.udemy.oop.taxonomicalstructuresandcharacteristics.typing.OrderSubclassTypeEnum.CLADE;
import static com.udemy.oop.taxonomicalstructuresandcharacteristics.typing.OrderSubclassTypeEnum.ORDER;

public enum EuarchontaSuperorder {
    SCANDENTIA(ORDER),
    PRIMATORPHA(CLADE);

    OrderSubclassTypeEnum subclass;

    EuarchontaSuperorder(OrderSubclassTypeEnum subclass) {
        this.subclass = subclass;
    }
}
