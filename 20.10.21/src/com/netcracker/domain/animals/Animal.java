package com.netcracker.domain.animals;

public abstract class Animal {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    Animal(String name, int age){
        this.name=name;
        this.age=age;
    }

    public abstract void voice();

}

