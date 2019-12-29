package com.udemy.oop.taxonomicalstructuresandcharacteristics;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public interface Family {
    Set<Genus> genusSet = new TreeSet<Genus>();

    Family addGenus(Genus genus);

    Family addGenusList(List<Genus> genusList);
}
