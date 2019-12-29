package com.udemy.oop.lifeorganizedtaxonomically.eukaryoticdomain.animaliakingdom;

import com.udemy.oop.biologicalstructures.CellularRespiration;
import com.udemy.oop.biologicalstructures.Reproduction;
import com.udemy.oop.biologicalstructures.SourcesOfEnergy;
import com.udemy.oop.lifeorganizedtaxonomically.eukaryoticdomain.EukaryaDomain;
import com.udemy.oop.taxonomicalstructuresandcharacteristics.*;

import java.util.List;

import static com.udemy.oop.biologicalstructures.CellularRespiration.AEROBIC;
import static com.udemy.oop.biologicalstructures.Reproduction.SEXUAL;
import static com.udemy.oop.biologicalstructures.SourcesOfEnergy.HETEROTROPH;

public class AnimaliaKingdom extends EukaryaDomain implements Kingdom {
    SourcesOfEnergy source;
    CellularRespiration respiration;
    Reproduction sexualReproduction;
    String commonName;
    SourcesOfEnergy sourcesOfEnergy;

    public AnimaliaKingdom() {
        super();
        source = HETEROTROPH;
        respiration = AEROBIC;
        sexualReproduction = SEXUAL;
        commonName = "Animal";
//        addPhylum();
    }

    public Kingdom addPhylum(Phylum phylum) {
        return this;
    }

    public Kingdom addPhylumList(List<Phylum> phylum) {
        return this;
    }
}
