package com.udemy.oop.taxonomicalstructuresandcharacteristics;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public interface Kingdom extends Domain {
    Set<Phylum> phylumSet = new TreeSet<Phylum>();

    Kingdom addPhylum(Phylum phylum);

    Kingdom addPhylumList(List<Phylum> phylum);
}
