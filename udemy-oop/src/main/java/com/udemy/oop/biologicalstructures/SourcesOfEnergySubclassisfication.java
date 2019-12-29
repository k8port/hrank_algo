package com.udemy.oop.biologicalstructures;

import com.udemy.oop.biologicalstructures.SourcesOfEnergy;

import static com.udemy.oop.biologicalstructures.SourcesOfEnergy.AUTOTROPH;
import static com.udemy.oop.biologicalstructures.SourcesOfEnergy.HETEROTROPH;

public enum SourcesOfEnergySubclassisfication {
    CHEMOAUTOTROPH(AUTOTROPH),
    PHOTOAUTOTROPH(AUTOTROPH),
    CHEMOHETEROTROPH(HETEROTROPH),
    PHOTOHETEROTROPH(HETEROTROPH);

    SourcesOfEnergy parent;

    SourcesOfEnergySubclassisfication(SourcesOfEnergy parent) {
        this.parent = parent;
    }
}
