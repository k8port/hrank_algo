package com.udemy.oop.taxonomicalstructuresandcharacteristics;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public interface SuperClassClade extends ClassT {
    Set<ClassT> classTSet = new TreeSet<ClassT>();

    SuperClassClade addClassT(ClassT classT);

    SuperClassClade addClassTList(List<ClassT> classTList);
}
