package com.bootcoding.java.Collections.Anaylist.Docter;

import com.bootcoding.java.Collections.Anaylist.Docter.Record;
import com.bootcoding.java.Collections.Anaylist.Docter.Service;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Service service =new Service();
        ArrayList<Record> record = service.getRecords(10000);

        for (int i = 1; i< record.size(); i++) {
            System.out.println(i);
            System.out.println("Name = " + record.get(i).getName("n"));
            System.out.println("Education = " + record.get(i).getEducation("y"));
            System.out.println("Type = "+ record.get(i).getType("l"));
            System.out.println("Age = "+ record.get(i).getAge(26));
        }
    }
}
