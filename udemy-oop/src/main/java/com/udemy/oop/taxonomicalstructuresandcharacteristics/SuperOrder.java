package com.udemy.oop.taxonomicalstructuresandcharacteristics;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public interface SuperOrder extends Order {
    Set<Order> orderSet = new TreeSet<Order>();

    SuperOrder addOrder(Order order);

    SuperOrder addOrders(List<Order> orderList);
}
