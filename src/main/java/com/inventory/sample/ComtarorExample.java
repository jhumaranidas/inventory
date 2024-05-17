package com.inventory.sample;

import java.util.Comparator;

public class ComtarorExample {

    private Integer id;
    private String name;
    private String email;
    private Integer age;

    public ComtarorExample(Integer id, String name, String email, Integer age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public Integer getAge() {
        return age;
    }
}

class DemoComtarorExample implements Comparator<ComtarorExample> {


    @Override
    public int compare(ComtarorExample obj1, ComtarorExample obj2) {
        if(obj1.getAge() == obj2.getAge())
            return 0;
        else if(obj1.getAge() > obj2.getAge())
            return 1;
        else
            return -1;
    }

}


