package com.udemy.oop.taxonomicalstructuresandcharacteristics;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public interface InfraPhylum extends Phylum{
    Set<SubPhylum> subPhylumSet = new TreeSet<SubPhylum>();

    InfraPhylum addInfraPhylum(SubPhylum subPhylum);

    InfraPhylum addSubPhylum(List<SubPhylum> subPhylumList);

}
