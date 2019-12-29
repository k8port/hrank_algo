package com.udemy.oop.taxonomicalstructuresandcharacteristics;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public interface SubKingdom extends Kingdom {
    Set<SubKingdomClade> subKingdomCladeSet = new TreeSet<SubKingdomClade>();

    SubKingdom addClade(SubKingdomClade subKingdomClade);

    SubKingdom addClades(List<SubKingdomClade> subKingdomClades);
}
