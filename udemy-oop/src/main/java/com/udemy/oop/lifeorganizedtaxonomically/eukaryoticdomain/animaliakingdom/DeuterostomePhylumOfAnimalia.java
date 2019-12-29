package com.udemy.oop.lifeorganizedtaxonomically.eukaryoticdomain.animaliakingdom;

public enum DeuterostomePhylumOfAnimalia {
    CHORDATA(
            "With a cord",
            "Chordates",
            "Hollow dorsal nerve cord, notochord, pharyngeal slits, endostyle, post-anal tail",
            55000,
            0),
    ECHINODERMATA(
            "Spiny skin",
            "Echinoderms",
            "Fivefold radial symmetry in living forms, mesodermal calcified spines",
            7500,
            13000),
    HERMICHORDATA(
            "Half chord",
            "Acorn Worms",
            "Stomochord in collar, pharyngeal slits",
            130,
            0);

    private String meaning;
    private String commonName;
    private String characteristics;
    private int species;
    private int extinct;

    DeuterostomePhylumOfAnimalia(String meaning, String commonName, String characteristics, int species, int extinct) {
        this.meaning = meaning;
        this.commonName = commonName;
        this.characteristics = characteristics;
        this.species = species;
        this.extinct = extinct;
    }

    public String getCommonName() {
        return commonName;
    }
}
