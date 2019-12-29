package com.udemy.oop.taxonomicalstructuresandcharacteristics;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public interface SuperClass extends ClassT {
    Set<SuperClassClade> superClassCladeSet = new TreeSet<SuperClassClade>();

    SuperClass addSuperClassClade(SuperClassClade superClassClade);

    SuperClass addSuperClassClade(List<SuperClassClade> superClassCladeList);
}
