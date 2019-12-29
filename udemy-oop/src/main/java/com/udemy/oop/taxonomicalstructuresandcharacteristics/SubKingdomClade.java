package com.udemy.oop.taxonomicalstructuresandcharacteristics;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public interface   SubKingdomClade extends Kingdom {
    Set<AnimalGroup> animalGroupSet = new TreeSet<AnimalGroup>();

    SubKingdomClade addAnimalGroup(AnimalGroup animalGroup);

    SubKingdomClade addAnimalGroups(List<AnimalGroup> animalGroups);
}
