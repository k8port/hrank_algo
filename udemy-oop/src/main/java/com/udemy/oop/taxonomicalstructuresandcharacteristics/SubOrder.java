package com.udemy.oop.taxonomicalstructuresandcharacteristics;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public interface SubOrder extends Order {
    Set<Family> familySet = new TreeSet<Family>();

    SubOrder addFamily(Family family);

    SubOrder addFamilies(List<Family> familyList);
}
