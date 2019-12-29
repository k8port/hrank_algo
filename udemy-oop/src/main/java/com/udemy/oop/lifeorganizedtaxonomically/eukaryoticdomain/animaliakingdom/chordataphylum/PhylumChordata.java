package com.udemy.oop.lifeorganizedtaxonomically.eukaryoticdomain.animaliakingdom.chordataphylum;

import com.udemy.oop.lifeorganizedtaxonomically.eukaryoticdomain.animaliakingdom.DeuterostomePhylumOfAnimalia;
import com.udemy.oop.lifeorganizedtaxonomically.eukaryoticdomain.animaliakingdom.PhylumClassificationOfAnimalia;

import java.util.List;

import static com.udemy.oop.lifeorganizedtaxonomically.eukaryoticdomain.animaliakingdom.DeuterostomePhylumOfAnimalia.CHORDATA;
import static com.udemy.oop.lifeorganizedtaxonomically.eukaryoticdomain.animaliakingdom.PhylumClassificationOfAnimalia.DEUTEROSTOME;

public class PhylumChordata {
    PhylumClassificationOfAnimalia classification;
    DeuterostomePhylumOfAnimalia deuterostomeType;
    List<String> features;
    ChordataEmbryo embryo;

    PhylumChordata() {
        classification = DEUTEROSTOME;
        deuterostomeType = CHORDATA;
        features.add("Notochord supporting body");
        features.add("Nervous system from dorsal nerve chord");
        embryo = new ChordataEmbryo();
    }

    public class ChordataEmbryo {
        List<String> characteristics;

        ChordataEmbryo() {
            this.characteristics.add("Pharynx with slits");
            this.characteristics.add("Tail extending past anus");
        }
    }
}
