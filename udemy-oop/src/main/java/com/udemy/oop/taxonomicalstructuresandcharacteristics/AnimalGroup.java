package com.udemy.oop.taxonomicalstructuresandcharacteristics;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public interface AnimalGroup extends Kingdom {

    Set<Phylum> phylumSet = new TreeSet<Phylum>();

    AnimalGroup addPhylum(Phylum phylum);

    AnimalGroup addPhylum(List<Phylum> phylumList);
}
