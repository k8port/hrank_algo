package com.udemy.oop.lifeorganizedtaxonomically.eukaryoticdomain.animaliakingdom.chordataphylum.vertebrates.mammalia.theria.eutheria.primates.hominidae;

import com.udemy.oop.taxonomicalstructuresandcharacteristics.typing.FamilyTypeHierarchyEnum;

import static com.udemy.oop.taxonomicalstructuresandcharacteristics.typing.FamilyTypeHierarchyEnum.SUBFAMILY;

public enum HominidaeFamily {
    PONGINAE(SUBFAMILY),
    HOMININAE(SUBFAMILY);

    private FamilyTypeHierarchyEnum familyType;

    HominidaeFamily(FamilyTypeHierarchyEnum familyType) {
        this.familyType = familyType;
    }
}
