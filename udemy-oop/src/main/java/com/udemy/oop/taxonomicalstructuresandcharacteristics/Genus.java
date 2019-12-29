package com.udemy.oop.taxonomicalstructuresandcharacteristics;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public interface Genus {
    Set<Species> speciesSet = new TreeSet<Species>();

    Genus addSpecies(Species species);

    Genus addSpeciesList(List<Species> speciesList);
}
