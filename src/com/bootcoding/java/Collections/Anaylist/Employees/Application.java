package com.bootcoding.java.Collections.Anaylist.Employees;

import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
        Service service =new Service();
        ArrayList<Record> records = service.getRecord(10000);

        for (int i = 1; i< records.size(); i++){
            System.out.println(i);
            System.out.println("Name ="+ records.get(i).getName());
            System.out.println("Experience = "+ records.get(i).getExperience());
            System.out.println("Salary = "+ records.get(i).getSalary());
            System.out.println("Age = "+ records.get(i).getAge());
        }
    }
}
