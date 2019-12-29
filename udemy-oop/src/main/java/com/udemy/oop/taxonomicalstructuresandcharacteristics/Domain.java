package com.udemy.oop.taxonomicalstructuresandcharacteristics;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public interface Domain {
    Set<Kingdom> kingdomSet = new TreeSet<Kingdom>();

    Domain addKingdom(Kingdom kingdom);

    Domain addKingdoms(List<Kingdom> kingdoms);
}
