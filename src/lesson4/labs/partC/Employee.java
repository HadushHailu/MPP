package lesson4.labs.partC;

import java.util.Date;

public abstract class Employee {
    private String empId;

    Employee(String empId){
        this.empId = empId;
    }

    public void print(){}
    public Paycheck calcCompensation(int year,
                                     int month){
        //--UnImplemented
        return new Paycheck();
    }

    public abstract double calcGrossPay(int year,
                                        int month);

}
