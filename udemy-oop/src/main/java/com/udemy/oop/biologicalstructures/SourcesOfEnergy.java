package com.udemy.oop.biologicalstructures;

public enum SourcesOfEnergy {
    AUTOTROPH(
            "Primary Producers",
            "the production of chemical energy in organic compounds by living organisms",
            "the sun"),
    HETEROTROPH(
            "Other",
            "cannot produce food, instead taking nutrition from other sources of organic carbon",
            "plant and animal matter");
    private String description;
    private String definition;
    private String primarySource;

    SourcesOfEnergy(String description, String definition, String primarySource) {
        this.description = description;
        this.definition = definition;
        this.primarySource = primarySource;
    }
}
