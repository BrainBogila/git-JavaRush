package com.javarush.test.level11.lesson11.home07;

/* Вторая правильная «цепочка наследования»
Расставь правильно «цепочку наследования» в классах: Carnivora (плотоядное животное), Cow (корова), Dog(собака), Pig(свинья), Animal (животное).
*/

public class Solution
{
    public static void main(String[] args)
    {
    }

    public class Carnivora extends Animal {
        private String prey;

        public Carnivora(int age, String breed, int weight, String prey)
        {
            super(age, breed, weight);
            this.prey = prey;
        }
    }

    public class Cow extends Animal {
        private String clasS;
        private int milkAday;

        public Cow(int age, String breed, int weight, String clasS, int milkAday)
        {
            super(age, breed, weight);
            this.clasS = clasS;
            this.milkAday = milkAday;
        }
    }

    public class Dog extends Carnivora {
        private String  favoriteMeet;

        public Dog(int age, String breed, int weight, String prey, String favoriteMeet)
        {
            super(age, breed, weight, prey);
            this.favoriteMeet = favoriteMeet;
        }
    }

    public class Pig extends Animal {
        private String clasS;
        private int helth;

        public Pig(int age, String breed, int weight, String clasS, int helth)
        {
            super(age, breed, weight);
            this.clasS = clasS;
            this.helth = helth;
        }
    }

    public class Animal {
        private int age;
        private String breed;
        private int weight;

        public Animal(int age, String breed, int weight)
        {
            this.age = age;
            this.breed = breed;
            this.weight = weight;
        }
    }
}
