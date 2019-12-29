package com.udemy.oop.lifeorganizedtaxonomically.eukaryoticdomain.plantaekingdom;


import static com.udemy.oop.lifeorganizedtaxonomically.eukaryoticdomain.plantaekingdom.PhylumClassificationOfPlantae.PlantaeScope.*;

public enum PhylumClassificationOfPlantae {

    EMBRYOPHYTA(
            "Land plants",
            "Embryophota",
            SENSU_STRICTISSIMO,
            "Include liverworts, hornworts, mosses, and vascular plants, as well ass fossil plants similar"
            + " to these surviving groups"),
    VIRIDIPLANTAE(
            "Green plants",
            "Viridplantae, Viridphyta, Chlorobionta, Chloroplastida",
            SENSU_STRICTO,
            "Include the green algae, land plants that emerged with them, including stoneworts."
            + " The relationships between plant groups are still being worked out, and the names given to them"
            + " vary considerably. The clade Viridplantae encompassses a group of organisms that have cellulose"
            + " in their cell walls, possess chlorophylls and have plastids bound by only two membranes that"
            + " are capable of photosynthesis and of storing starch."),
    ARCHAEPLASTIDA(
            "Red algae",
            "Plastida, Primoplantae",
            SENSU_LATO,
            "Green plants listed above plus red algae called Rhodophyta and glaucophyte algae called"
            + " Glaucophyta that store Floridean starch outside the plastids in the cytoplasm.  This clade includes"
            + " all the organisms that eons ago acquired their primary choloroplasts directly by engulfing"
            + " cyanobacteria"),
    OBSOLETE_DEFINITIONS(
            "Obsolete",
            "",
            SENSU_AMPLO,
            "Older, obsolete classifications that placed diverse algae, fungi or bacteria in Plantae."
    );

    private String commonName;
    private String scientificNames;
    private PlantaeScope scope;
    private String description;

    PhylumClassificationOfPlantae(String commonName, String scientificNames, PlantaeScope scope, String description) {
        this.commonName = commonName;
        this.scientificNames = scientificNames;
        this.scope = scope;
        this.description = description;
    }

    enum PlantaeScope {
        SENSU_STRICTISSIMO("most narrow sense"),
        SENSU_STRICTO("narrow sense"),
        SENSU_LATO("broad sense"),
        SENSU_AMPLO("generous sense");

        private String meaning;

        PlantaeScope(String meaning) {
            this.meaning = meaning;
        }
    }

    private enum ArchaeplastidaSubdivisionEnum {
        RHODOPHYTA("Red Algae"),
        RHODOPHIDIA("predatorial"),
        PICOZOA(""),
        GLAUCOPHYTA("Glaucophyte algae"),
        GREEN_PLANTS("Green plants"),
        CRYPTISTA("");

        private String commonName;

        ArchaeplastidaSubdivisionEnum(String commonName) {
            this.commonName = commonName;
        }
    }

    private enum ViridplantaeDivisions {
        GREEN_ALGAE,
        BRYOPHYTES,
        PTERIDOPHYTES,
        SEED_PLANTS;
    }
}
