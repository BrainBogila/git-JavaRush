package com.javarush.test.level11.lesson11.home03;

/* Эволюция
Написать четыре класса: Fish(Рыбы), Animal(Животные), Ape(Обезьяны), Human (Человек).
Унаследовать животных от рыб, обезьян от животных и человека от обезьян.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Fish {
        private boolean sex;
        private int age;
        private int weight;

        public Fish(boolean sex, int age, int weight)
        {
            this.sex = sex;
            this.age = age;
            this.weight = weight;
        }
    }

    public static class Animal extends Fish {
        private String species;

        public Animal(boolean sex, int age, int weight, String species)
        {
            super(sex, age, weight);
            this.species = species;
        }
    }

    public static class Ape extends Animal {
        private String clasS;

        public Ape(boolean sex, int age, int weight, String species, String clasS)
        {
            super(sex, age, weight, species);
            this.clasS = clasS;
        }
    }

    public static class Human extends Ape {
        private String russ;

        public Human(boolean sex, int age, int weight, String species, String clasS, String russ)
        {
            super(sex, age, weight, species, clasS);
            this.russ = russ;
        }
    }

}
