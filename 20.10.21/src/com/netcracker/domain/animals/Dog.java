package com.netcracker.domain.animals;

public class Dog extends Animal implements Runnable {
    String voice;

    Dog(String name, int age,String voice){
        super(name,age);//вызов родительского конструктора
        this.voice=voice;// Сначала вызываем родительский конструктор
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void voice(){
        System.out.println(voice);
    }

    @Override
    public void run() {
        System.out.println("собака бежит");
    }
}
