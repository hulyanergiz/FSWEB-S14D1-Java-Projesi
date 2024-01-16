package com.workintech.company;

import java.util.Arrays;

public class HRManager extends Employee {

        private JuniorDeveloper[] juniorDevelopers;
        private  MidDeveloper[] midDevelopers;
        private SeniorDeveloper[] seniorDevelopers;


    public HRManager(long id, String name, double salary) {
        super(id, name, salary);
        this.juniorDevelopers=new JuniorDeveloper[4];
        this.midDevelopers=new MidDeveloper[4];
        this.seniorDevelopers=new SeniorDeveloper[4];
    }

    @Override
    public void work() {
        System.out.println("HR manager starts to working ");
    }

    public void addEmployee(JuniorDeveloper juniorDev, int index){
        if(index<0){
            System.out.println("Index cannot be negative.Typed index:"+index);
        }else if(index>= juniorDevelopers.length){
            System.out.println("addEmployee: "+index+". index is not exist in junior developers array");
        }else {
            try {boolean isExist=false;
                if(Arrays.asList(juniorDevelopers).contains(juniorDev)){
                    isExist=true;
                    System.out.println(juniorDev.getName()+" is already exist in junior developers list");
                }
                if(!isExist){
                    if(juniorDevelopers[index]!=null){
                    System.out.println(index+". index is not empty in junior developers array");
                }else {

                    juniorDevelopers[index]=juniorDev;
                        System.out.println(juniorDev.getName()+" is added to junior developers list");
                }
                }

            }catch(ArrayIndexOutOfBoundsException exception){
                System.out.println(index+" is an invalid index");
            }catch(Exception exception){
                System.out.println("error: "+exception.getMessage());
            }
        }

    }
    public void addEmployee(MidDeveloper midDev, int index){
        if(index<0){
            System.out.println("Index cannot be negative.Typed index:"+index);
        }else if(index>= midDevelopers.length){
            System.out.println("addEmployee: "+index+". index is not exist in mid developers array");
        }else {
            try {boolean isExist=false;
                if(Arrays.asList(midDevelopers).contains(midDev)){
                    isExist=true;
                    System.out.println(midDev.getName()+" is already exist in mid developers array");
                }
                if(!isExist){
                    if(midDevelopers[index]!=null){
                        System.out.println(index+". index is not empty in mid developers list");
                    }
               else {
                    midDevelopers[index]=midDev;
                        System.out.println(midDev.getName()+ " is added to mid developers list");
                }
                }
            }catch(ArrayIndexOutOfBoundsException exception){
                System.out.println(index+" is an invalid index");
            }catch(Exception exception){
                System.out.println("error: "+exception.getMessage());
            }
        }

    }
    public void addEmployee(SeniorDeveloper seniorDev, int index){
        if(index<0){
            System.out.println("Index cannot be negative.Typed index:"+index);
        }else if(index>= seniorDevelopers.length){
            System.out.println("addEmployee: "+index+". index is not exist in senior developers array");
        }else {
            try {boolean isExist=false;
                if(Arrays.asList(seniorDevelopers).contains(seniorDev)){
                    isExist=true;
                    System.out.println(seniorDev.getName()+" is already exist in senior developers list");
                }
                if(!isExist) {
                    if (seniorDevelopers[index] != null) {
                        System.out.println(index+ " is not empty in senior developers list");
                    } else {
                        seniorDevelopers[index] = seniorDev;
                        System.out.println(seniorDev.getName()+" is added to senior developers list");
                    }
                }
            }catch(ArrayIndexOutOfBoundsException exception){
                System.out.println(index+" is an invalid index");
            }catch(Exception exception){
                System.out.println("error: "+exception.getMessage());
            }
        }

    }

}
