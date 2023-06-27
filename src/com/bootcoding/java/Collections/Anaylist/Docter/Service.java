package com.bootcoding.java.Collections.Anaylist.Docter;

import java.util.ArrayList;
import java.util.Random;

public class Service {
    public ArrayList <Record> getRecords(int size) {
        ArrayList<Record> records = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            Record record = buildRecord();
            records.add(record);
        }
        return records;
    }

    public Record buildRecord(){
        Record record = new Record();
        record.setName(getRandomName());
        record.setEducation(getRandomEdu());
        record.setType(getRandomType());
        record.setAge(getRandomAge());
        return record;
    }

    private String getRandomName(){
        String[] Name = {"rohit","shreemayee","kiran","swanand","tanmay","chinmay","rupali","kashvi"};
        int randomIndex = new Random().nextInt(Name.length);
        return Name[randomIndex];
    }

    private String getRandomEdu(){
        String[] edu = {"MBBS","MD","PHD"};
        int randomIndex = new Random().nextInt(edu.length);
        return edu[randomIndex];
    }

    private String getRandomType(){
        String[] type={"cardio","neuro","ortho","ayurvedic"};
        int randomIndex = new Random().nextInt(type.length);
        return type[randomIndex];
    }

    private int getRandomAge(){
        int min = 25;
        int max = 40;
        return min + new Random().nextInt(max-min);

    }


}
