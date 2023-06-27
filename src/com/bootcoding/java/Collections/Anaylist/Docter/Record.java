package com.bootcoding.java.Collections.Anaylist.Docter;

public class Record {
    public String Name;
    public String Education;
    public String Type;
    public int Age;
    private String randomName;

    public String getName(String randomName) {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEducation(String randomEdu) {
        return Education;
    }

    public void setEducation(String education) {
        Education = education;
    }

    public String getType(String randomType) {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public int getAge(int randomAge) {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }


}
