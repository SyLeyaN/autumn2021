package com.netcracker.domain.animals;

public class Main
{
    public static void main(String[] args) { // psvm
        Dog dog = new Dog("Жучка", 2, "гав-гав");
        Cat cat = new Cat("Мурзик", 2, "Мяу");

        dog.voice();// <- сообщение
        cat.voice();

    }
}
