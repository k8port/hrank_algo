package com.udemy.oop.taxonomicalstructuresandcharacteristics;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public interface SubPhylum extends Phylum{
    Set<SuperClass> superClassSet = new TreeSet<SuperClass>();

    SubPhylum addSuperClass(SuperClass superClass);

    SubPhylum addSuperClass(List<SuperClass> superClassList);
}
