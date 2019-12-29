package com.udemy.oop.lifeorganizedtaxonomically.eukaryoticdomain.animaliakingdom.chordataphylum.vertebrates.mammalia;

import com.udemy.oop.lifeorganizedtaxonomically.Eukaryote;
import com.udemy.oop.lifeorganizedtaxonomically.eukaryoticdomain.EukaryaDomain;
import com.udemy.oop.lifeorganizedtaxonomically.eukaryoticdomain.animaliakingdom.AnimaliaKingdom;
import com.udemy.oop.lifeorganizedtaxonomically.eukaryoticdomain.animaliakingdom.DeuterostomePhylumOfAnimalia;
import com.udemy.oop.taxonomicalstructuresandcharacteristics.Cellular;
import com.udemy.oop.taxonomicalstructuresandcharacteristics.Domain;

public abstract class Mammalia extends AnimaliaKingdom {
    Cellular cell;
    Domain domain;
    DeuterostomePhylumOfAnimalia phylum;

    public Mammalia() {
        super();
        cell = new Eukaryote(true, true, 46);
        domain = new EukaryaDomain();
        phylum = DeuterostomePhylumOfAnimalia.CHORDATA;
    }
}
