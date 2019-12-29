package com.udemy.oop.lifeorganizedtaxonomically.eukaryoticdomain.animaliakingdom;

public enum OtherPhylumOfAnimalia {
    CNIDARIA(
            "Stinging nettle",
            "Cnidarians",
            "Nematocysts",
            16000,
            0),
    COELENTERATA(
            "",
            "Corals & Jellyfish",
            "",
            0,
            0),
    CTENOPHORA(
            "Comb bearer",
            "Comb jellies",
            "Eight comb rows of fused cilia",
            150,
            0),
    PLACAZOA(
            "Plate animals",
            "Trichoplaxes",
            "Differentiated top and bottom surfaces, two ciliated cell layers,"
                    + " amoebid fiber cells in between",
            1,
            0),
    PORIFERA(
            "Pore bearer",
            "Sponges",
            "Perforated interior wall",
            10800,
            0);

    private String meaning;
    private String commonName;
    private String characteristics;
    private int species;
    private int extinct;

    OtherPhylumOfAnimalia(String meaning, String commonName, String characteristics, int species, int extinct) {
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
