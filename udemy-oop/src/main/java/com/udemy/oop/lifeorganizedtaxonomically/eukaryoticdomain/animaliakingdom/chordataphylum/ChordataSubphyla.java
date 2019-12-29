package com.udemy.oop.lifeorganizedtaxonomically.eukaryoticdomain.animaliakingdom.chordataphylum;

import com.udemy.oop.lifeorganizedtaxonomically.eukaryoticdomain.animaliakingdom.PhylumClassificationOfAnimalia.MajorClassification;

import static com.udemy.oop.lifeorganizedtaxonomically.eukaryoticdomain.animaliakingdom.PhylumClassificationOfAnimalia.MajorClassification.INVERTEBRATE;
import static com.udemy.oop.lifeorganizedtaxonomically.eukaryoticdomain.animaliakingdom.PhylumClassificationOfAnimalia.MajorClassification.VERTEBRATE;

public enum ChordataSubphyla {
    UROCHORDATA(INVERTEBRATE, "tunicates"),
    CEPHALOCHORDATA(INVERTEBRATE, "lancelets"),
    VERTEBRATA(VERTEBRATE, "vertebrates");

    private MajorClassification majorClassification;
    private String commonName;

    ChordataSubphyla(MajorClassification majorClassification, String commonName) {
        this.majorClassification = majorClassification;
        this.commonName = commonName;
    }
}
