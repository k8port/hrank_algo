package com.udemy.oop.lifeorganizedtaxonomically.eukaryoticdomain.animaliakingdom.chordataphylum.vertebrates.mammalia.theria.eutheria.primates.hominidae.ponginae;

import com.udemy.oop.taxonomicalstructuresandcharacteristics.typing.FamilyTypeHierarchyEnum;

import static com.udemy.oop.taxonomicalstructuresandcharacteristics.typing.FamilyTypeHierarchyEnum.TRIBE;

public enum PonginaeSubfamily {
    PONGINI(TRIBE);

    private FamilyTypeHierarchyEnum familyType;

    PonginaeSubfamily(FamilyTypeHierarchyEnum familyType) {
        this.familyType = familyType;
    }
}
