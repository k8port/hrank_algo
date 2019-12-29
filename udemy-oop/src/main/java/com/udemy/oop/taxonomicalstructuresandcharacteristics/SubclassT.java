package com.udemy.oop.taxonomicalstructuresandcharacteristics;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public interface SubclassT {
    Set<InfraClass> infraClassSet = new TreeSet<InfraClass>();

    SubclassT addInfraClass(InfraClass infraClass);

    SubclassT addInfraClasses(List<InfraClass> infraClassList);
}
