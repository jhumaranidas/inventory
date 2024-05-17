package com.inventory.sample;

public class ComparableExample implements Comparable<ComparableExample>{

    private Integer id;
    private String name;
    private String email;
    private Integer age;


    @Override
    public int compareTo(ComparableExample obj) {
        if(age==obj.age)
            return 0;
        else if(age>obj.age)
            return 1;
        else
            return -1;
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
