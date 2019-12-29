package com.udemy.oop.taxonomicalstructuresandcharacteristics;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public interface Phylum {

    Set<InfraPhylum> phylumSet = new TreeSet<InfraPhylum>();

    Phylum addInfraPhylum(InfraPhylum infraPhylum);

    Phylum addInfraPhylum(List<InfraPhylum> infraPhylumList);

}
