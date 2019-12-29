package com.udemy.oop.taxonomicalstructuresandcharacteristics;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public interface Magnorder extends Order {
    Set<SuperOrder> superOrderSet = new TreeSet<SuperOrder>();

    Magnorder addSuperOrder(SuperOrder superOrder);

    Magnorder addSuperOrders(List<SuperOrder> superOrderList);
}
