package com.javarush.test.level11.lesson11.bonus01;

/* Нужно исправить программу, чтобы компилировалась и работала
Исправь наследование в классах: (классы Cat, Dog, Pet, House, Airplane).
*/

public class Solution
{
    public static void main(String[] args)
    {
    }

    public class Pet {
        private int age;
        private int weight;

        public Pet(int age, int weight)
        {
            this.age = age;
            this.weight = weight;
        }
    }

    public class Cat extends Pet {
        private String breed;

        public Cat(int age, int weight, String breed)
        {
            super(age, weight);
            this.breed = breed;
        }
    }

    public class Dog extends Pet {
        private String breed;

        public Dog(int age, int weight, String breed)
        {
            super(age, weight);
            this.breed = breed;
        }
    }

    public class House {
        private String address;

        public House(String address)
        {
            this.address = address;
        }
    }

    public class Airplane {
        private int number;

        public Airplane(int number)
        {
            this.number = number;
        }
    }
}
