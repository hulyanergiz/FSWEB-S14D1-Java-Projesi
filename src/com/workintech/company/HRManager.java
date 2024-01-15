package com.workintech.company;

public class HRManager extends Employee {

        private JuniorDeveloper[] juniorDevelopers=new JuniorDeveloper[4];
        private  MidDeveloper[] midDevelopers=new MidDeveloper[4];
        private SeniorDeveloper[] seniorDevelopers=new SeniorDeveloper[4];

    public HRManager(long id, String name, double salary, JuniorDeveloper[] juniorDevelopers, MidDeveloper[] midDevelopers, SeniorDeveloper[] seniorDevelopers) {
        super(id, name, salary);
        this.juniorDevelopers = juniorDevelopers;
        this.midDevelopers = midDevelopers;
        this.seniorDevelopers = seniorDevelopers;
    }

    @Override
    public void work() {
        System.out.println("HR manager starts to working ");
    }

}
