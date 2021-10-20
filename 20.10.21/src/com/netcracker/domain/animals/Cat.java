package com.netcracker.domain.animals;

public class Cat extends Animal implements Runnable{

    String voice;
    Voicer voicer = new Voicer();

    Cat(String name, int age,String voice){
        super(name,age);//вызов родительского конструктора
        this.voice=voice;
    }

    @Override
    public void voice(){
        System.out.println(voice);
        //voicer.voice(); аналогично верхнему
    }
    private  void voiceCat(){
        System.out.println("Я волшебный код");
    }

    @Override
    public void run() {
        System.out.println("кошка бежит");
    }
}




