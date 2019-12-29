package com.udemy.oop.taxonomicalstructuresandcharacteristics;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public interface InfraClass extends ClassT {
    Set<Magnorder> magnorderSet = new TreeSet<Magnorder>();

    public InfraClass addMagnorder(Magnorder magnorder);

    public InfraClass addMagnorders(List<Magnorder> magnorderList);
}
