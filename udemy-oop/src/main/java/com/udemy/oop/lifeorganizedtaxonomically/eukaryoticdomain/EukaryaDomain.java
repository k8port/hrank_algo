package com.udemy.oop.lifeorganizedtaxonomically.eukaryoticdomain;

import com.udemy.oop.lifeorganizedtaxonomically.*;
import com.udemy.oop.lifeorganizedtaxonomically.eukaryoticdomain.animaliakingdom.AnimaliaKingdom;
import com.udemy.oop.lifeorganizedtaxonomically.eukaryoticdomain.fungikingdom.FungiKingdom;
import com.udemy.oop.lifeorganizedtaxonomically.eukaryoticdomain.plantaekingdom.PlantaeKingdom;
import com.udemy.oop.lifeorganizedtaxonomically.eukaryoticdomain.protistakingdom.ProtistaKingdom;
import com.udemy.oop.taxonomicalstructuresandcharacteristics.Domain;
import com.udemy.oop.taxonomicalstructuresandcharacteristics.Kingdom;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EukaryaDomain extends Eukaryote implements Domain {

    private Set<Kingdom> kingdoms;
    public EukaryaDomain() {
        super();
        kingdoms = new TreeSet<Kingdom>();
    }

    public Domain addKingdom(Kingdom kingdom) {
        kingdoms.add(kingdom);
        return this;
    }

    public Domain addKingdoms(List<Kingdom> kingdoms) {
        kingdoms.addAll(kingdoms);
        return this;
    }
}
