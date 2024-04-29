package org.example;

public abstract class BaseHuman implements Comparable<BaseHuman> {
    private int salary;

    public int getSalary() {
        return salary;
    }

    public BaseHuman(int salary) {
        this.salary = salary;
    }

    public abstract double getAverageMonthlySalary();

    @Override
    public int compareTo(BaseHuman o) {
        return (int) (this.getAverageMonthlySalary() - o.getAverageMonthlySalary());
    }

    @Override
    public String toString() {
        return "salary = " + salary;
    }
}
