package com.udemy.oop.lifeorganizedtaxonomically.eukaryoticdomain.animaliakingdom.chordataphylum.vertebrates;

public enum VertebrateClasses {
    AGNATHA("jawless fish"),
    PLACODERMI("jawed armored fish (extinct)"),
    CHONDRICHTHYES("cartilaginous fish"),
    OSTEICHTHYES("bony fish"),
    AMPHIBIA("amphibians"),
    REPTILIA("reptiles"),
    AVES("birds"),
    MAMMALIA("mammals");

    private String common;

    VertebrateClasses(String common) {
        this.common = common;
    }
}
