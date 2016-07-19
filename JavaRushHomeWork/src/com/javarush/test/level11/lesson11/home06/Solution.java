package com.javarush.test.level11.lesson11.home06;

/* Первая правильная «цепочка наследования»
Расставь правильно «цепочку наследования» в классах: Pet (домашнее животное), Cat (кот), Dog(собака).
*/

public class Solution
{
    public static void main(String[] args)
    {
    }

    public class Pet {
        private String name;
        private int age;
        private int weight;

        public Pet(String name, int age, int weight)
        {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }
    }

    public class Cat extends Pet {
        private String breed;
        private int color;

        public Cat(String name, int age, int weight, String breed, int color)
        {
            super(name, age, weight);
            this.breed = breed;
            this.color = color;
        }
    }

    public class Dog extends Pet {
        private String breed;

        public Dog(String name, int age, int weight, String breed)
        {
            super(name, age, weight);
            this.breed = breed;
        }
    }
}
