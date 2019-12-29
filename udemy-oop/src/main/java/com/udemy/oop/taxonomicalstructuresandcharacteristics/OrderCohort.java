package com.udemy.oop.taxonomicalstructuresandcharacteristics;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public interface OrderCohort extends Order{

    Set<SubOrder> subOrderSet = new TreeSet<SubOrder>();

    OrderCohort addSubOrder(SubOrder subOrder);

    OrderCohort addSubOrders(List<SubOrder> subOrderList);
}
