package com.udemy.oop.lifeorganizedtaxonomically.eukaryoticdomain.animaliakingdom.chordataphylum.vertebrates.mammalia.theria.eutheria.primates.hominidae.homininae;

import com.udemy.oop.taxonomicalstructuresandcharacteristics.typing.FamilyTypeHierarchyEnum;

import static com.udemy.oop.taxonomicalstructuresandcharacteristics.typing.FamilyTypeHierarchyEnum.TRIBE;

public enum HomininaeSubfamily {
    GORILLINI(TRIBE),
    HOMININI(TRIBE);

    private FamilyTypeHierarchyEnum familyType;

    HomininaeSubfamily(FamilyTypeHierarchyEnum familyType) {
        this.familyType = familyType;
    }
}
