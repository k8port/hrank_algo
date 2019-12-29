package com.udemy.oop.taxonomicalstructuresandcharacteristics;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public interface SubOrderClade extends Order{

    Set<OrderCohort> orderCohortSet = new TreeSet<OrderCohort>();

    SubOrderClade addOrderCohort(OrderCohort orderCohort);

    SubOrderClade addOrderCohorts(List<OrderCohort> orderCohortList);
}
