package com.udemy.oop.lifeorganizedtaxonomically.eukaryoticdomain.animaliakingdom.chordataphylum;

public enum ChordataPhylumEnum {
    CEPHALOCHORDATA("Lancelets"),
    TUNICATA("Urochordata"),
    CRANIATA("Vertebrata");

    private String commonName;

    ChordataPhylumEnum(String commonName) {
        this.commonName = commonName;
    }
}
