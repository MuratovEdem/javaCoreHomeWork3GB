package org.example;

import java.util.Iterator;

public class Employees implements Iterable<BaseHuman>{

    private BaseHuman[] employees = {new Worker(500),
            new Freelancer(100),
            new Worker(15000),
            new Freelancer(250)};


    @Override
    public Iterator<BaseHuman> iterator() {
        return new EmployeesIterator();
    }

    class EmployeesIterator implements Iterator<BaseHuman> {
        int counter = 0;

        @Override
        public boolean hasNext() {
            return counter < employees.length;
        }

        @Override
        public BaseHuman next() {
            return employees[counter++];
        }
    }
}
