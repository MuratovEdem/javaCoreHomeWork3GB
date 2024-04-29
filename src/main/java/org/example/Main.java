package org.example;


public class Main {
    public static void main(String[] args) {
        BaseHuman[] workers = {new Worker(500),
                new Freelancer(100),
                new Worker(15000),
                new Freelancer(250)};

        Employees employees = new Employees();

        for (BaseHuman human: employees) {
            System.out.println(human);
        }
    }
}