package com.udemy.oop.lifeorganizedtaxonomically.eukaryoticdomain.animaliakingdom;

public enum BasalPhylumOfAnimalia {

    XENACOELOMORPHA(
            "Strange form without gut",
            "",
            "Bilaterian, but lacking typical bilaterian structures such as gut cavities,"
                + " anuses, and circulatory systems",
            400,
            0);

    private String meaning;
    private String commonName;
    private String characteristics;
    private int species;
    private int extinct;

    BasalPhylumOfAnimalia(String meaning, String commonName, String characteristics, int species, int extinct) {
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
