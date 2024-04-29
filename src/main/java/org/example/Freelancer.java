package org.example;

public class Freelancer extends BaseHuman{
    public Freelancer(int salary) {
        super(salary);
    }

    @Override
    public double getAverageMonthlySalary() {
        return getSalary();
    }

}
