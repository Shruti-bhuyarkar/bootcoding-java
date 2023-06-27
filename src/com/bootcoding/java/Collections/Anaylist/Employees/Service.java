package com.bootcoding.java.Collections.Anaylist.Employees;

import java.util.ArrayList;
import java.util.Random;

public class Service {
    public ArrayList <Record> getRecord(int size){
        ArrayList<Record> records = new ArrayList<>();
        for(int i = 0; i < size; i++){
           Record record = buildRecord();
           records.add(record);
        }
        return records;
    }
    public Record buildRecord(){
        Record record = new Record();
        record.setName(getRandomName());
        record.setExperience(getRandomExperience());
        record.setSalary(getRandomSalary());
        record.setAge(getRandomAge());
        return record;
    }

    private  String getRandomName(){
        String[] Name = {"sonu", "monu", "tinu", "machar", "watermelon", "undir", "lambinose"};
        int randomIndex = new Random().nextInt(Name.length);
        return Name[randomIndex];
    }

    private double getRandomExperience(){
        int min = 2 ;
       // int max = 10;
        return min + new Random().nextInt();

    }

    private  double getRandomSalary(){
        int min = 25000;
        int max = 100000;
        return  min + new Random().nextInt(max-min);
    }

    private int getRandomAge(){
        int min = 25;
        int max = 40;
        return min + new Random().nextInt(max-min);
    }



}
