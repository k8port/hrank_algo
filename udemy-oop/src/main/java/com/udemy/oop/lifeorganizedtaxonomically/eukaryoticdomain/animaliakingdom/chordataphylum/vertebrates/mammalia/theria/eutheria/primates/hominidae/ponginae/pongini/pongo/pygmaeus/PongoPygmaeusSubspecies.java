package com.udemy.oop.lifeorganizedtaxonomically.eukaryoticdomain.animaliakingdom.chordataphylum.vertebrates.mammalia.theria.eutheria.primates.hominidae.ponginae.pongini.pongo.pygmaeus;

import com.udemy.oop.taxonomicalstructuresandcharacteristics.typing.SpeciesTypeHierarchy;

import static com.udemy.oop.taxonomicalstructuresandcharacteristics.typing.SpeciesTypeHierarchy.SUBSPECIES;

public enum PongoPygmaeusSubspecies {
    PYGMAEUS(SUBSPECIES),
    MORIO(SUBSPECIES),
    WURBII(SUBSPECIES);

    private SpeciesTypeHierarchy type;

    PongoPygmaeusSubspecies(SpeciesTypeHierarchy speciesType) {
        this.type = speciesType;
    }
}
