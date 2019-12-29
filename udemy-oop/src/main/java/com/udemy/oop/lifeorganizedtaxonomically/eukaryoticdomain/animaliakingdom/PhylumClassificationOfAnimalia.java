package com.udemy.oop.lifeorganizedtaxonomically.eukaryoticdomain.animaliakingdom;

import static com.udemy.oop.lifeorganizedtaxonomically.eukaryoticdomain.animaliakingdom.PhylumClassificationOfAnimalia.CleavageCharacteristicAtEightCellStage.RADIAL_INDETERMINATE;
import static com.udemy.oop.lifeorganizedtaxonomically.eukaryoticdomain.animaliakingdom.PhylumClassificationOfAnimalia.CleavageCharacteristicAtEightCellStage.SPIRAL_DETERMINATE;
import static com.udemy.oop.lifeorganizedtaxonomically.eukaryoticdomain.animaliakingdom.PhylumClassificationOfAnimalia.CoelomFormation.ENTEROCOELOUS;
import static com.udemy.oop.lifeorganizedtaxonomically.eukaryoticdomain.animaliakingdom.PhylumClassificationOfAnimalia.CoelomFormation.SCHIZOCOELOUS;
import static com.udemy.oop.lifeorganizedtaxonomically.eukaryoticdomain.animaliakingdom.PhylumClassificationOfAnimalia.MajorClassification.INVERTEBRATE;
import static com.udemy.oop.lifeorganizedtaxonomically.eukaryoticdomain.animaliakingdom.PhylumClassificationOfAnimalia.MajorClassification.VERTEBRATE;

public enum PhylumClassificationOfAnimalia {
    PROTOSTOME(
            "first mouth",
            "oral end develops from first developmental opening, the blastophore",
            SPIRAL_DETERMINATE,
            SCHIZOCOELOUS,
            INVERTEBRATE),
    DEUTEROSTOME(
            "second mouth",
            "oral end develops from second opening on dorsal surface and the blastophore becomes the anus",
            RADIAL_INDETERMINATE,
            ENTEROCOELOUS,
            VERTEBRATE),
    BASAL(
            "disputed",
            "belonging to either or both",
            null,
            null,
            null
    ),
    OTHER(
            "neither",
            "belonging to neither",
            null,
            null,
            null
    );

    private String classification;
    private String explanation;
    private CleavageCharacteristicAtEightCellStage cleavage;
    private CoelomFormation coelomFormation;
    private MajorClassification majorClassification;

    PhylumClassificationOfAnimalia(String classification, String explanation,
                                   CleavageCharacteristicAtEightCellStage cleavage,
                                   CoelomFormation coelomFormation,
                                   MajorClassification majorClassification) {
        this.classification = classification;
        this.explanation = explanation;
        this.cleavage = cleavage;
        this.coelomFormation = coelomFormation;
        this.majorClassification = majorClassification;
    }

    enum CleavageCharacteristicAtEightCellStage {
        SPIRAL_DETERMINATE("development fate of each cell already determined"),
        RADIAL_INDETERMINATE("each cell if separated capable of developing as complete organism");
        private String explanation;

        CleavageCharacteristicAtEightCellStage(String explanation) {
            this.explanation = explanation;
        }
    }

    enum CoelomFormation {
        SCHIZOCOELOUS("Solid masses of mesoderm split to form coelom"),
        ENTEROCOELOUS("folds of archenteron form coelom");

        private String description;

        CoelomFormation(String description) {
            this.description = description;
        }
    }

    public enum MajorClassification {
        VERTEBRATE,
        INVERTEBRATE;
    }
}
