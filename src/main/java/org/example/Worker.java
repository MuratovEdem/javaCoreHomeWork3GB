package org.example;

public class Worker extends BaseHuman{
    public Worker(int salary) {
        super(salary);
    }

    @Override
    public double getAverageMonthlySalary() {
        return  (20.8 * 8 * getSalary());
    }
}
