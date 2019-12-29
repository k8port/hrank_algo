package com.udemy.oop.lifeorganizedtaxonomically.eukaryoticdomain.animaliakingdom.chordataphylum.vertebrates.mammalia.theria.eutheria.primates.hominidae.homininae.hominini;

import com.udemy.oop.taxonomicalstructuresandcharacteristics.typing.FamilyTypeHierarchyEnum;

import static com.udemy.oop.taxonomicalstructuresandcharacteristics.typing.FamilyTypeHierarchyEnum.SUBTRIBE;

public enum HomininiTribe {
    PANINA(SUBTRIBE),
    HOMININA(SUBTRIBE);

    private FamilyTypeHierarchyEnum familyType;

    HomininiTribe(FamilyTypeHierarchyEnum familyType) {
        this.familyType = familyType;
    }
}
