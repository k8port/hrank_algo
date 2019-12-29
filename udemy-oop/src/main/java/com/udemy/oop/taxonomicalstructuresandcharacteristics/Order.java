package com.udemy.oop.taxonomicalstructuresandcharacteristics;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public interface Order {
    Set<SubOrderClade> subOrderCladeSet = new TreeSet<SubOrderClade>();

    Order addSubOrderClade(SubOrderClade subOrderClade);

    Order addSubOrderClade(List<SubOrderClade> subOrderCladeList);
}
