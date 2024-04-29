package org.example;

import java.util.Comparator;

public class SalaryComparator implements Comparator<BaseHuman> {
    @Override
    public int compare(BaseHuman o1, BaseHuman o2) {
        return o1.getSalary() - o2.getSalary();
    }
}
