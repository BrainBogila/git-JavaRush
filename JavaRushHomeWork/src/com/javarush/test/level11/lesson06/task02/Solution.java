package com.javarush.test.level11.lesson06.task02;

/* Домашние животные
Написать три класса: Pet (домашнее животное), Cat(кот) и Dog(собака).
Унаследовать кота и собаку от животного.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Cat cat = new Cat("Poor","black",10,true,"Sf");
        Dog dog = new Dog("Rich","browne",5,true,"ma",10);
    }

    public static class Pet {
        String name, color;
        int age;
        boolean sex;

        public Pet(String name, String color, int age, boolean sex)
        {
            this.name = name;
            this.color = color;
            this.age = age;
            this.sex = sex;
        }
    }

    public static class Cat extends Pet {
        String breed;

        public Cat(String name, String color, int age, boolean sex, String breed)
        {
            super(name, color, age, sex);
            this.breed = breed;
        }
    }

    public static class Dog extends Pet {
        String breed;
        int weight;

        public Dog(String name, String color, int age, boolean sex, String breed, int weight)
        {
            super(name, color, age, sex);
            this.breed = breed;
            this.weight = weight;
        }
    }
}
