package com.workintech.company;

public class MidDeveloper extends Employee{
    public MidDeveloper(long id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("MidDeveloper starts to working");
        setSalary(70000);
    }
}
