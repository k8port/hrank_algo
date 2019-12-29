package com.udemy.oop.taxonomicalstructuresandcharacteristics;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public interface ClassT extends Phylum {
    Set<SubclassT> subclassTaxonomical = new TreeSet<SubclassT>();

    ClassT addSubclass(SubclassT subclass);

    ClassT addSubclasses(List<SubclassT> subclassList);
}
