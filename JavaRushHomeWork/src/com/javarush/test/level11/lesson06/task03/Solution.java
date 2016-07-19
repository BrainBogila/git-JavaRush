package com.javarush.test.level11.lesson06.task03;

/* В гостях у бабушки
Написать шесть классов: Animal (животное), Cow(корова) и Pig(свинья), Sheep(овца), Bull(бык), Goat(козел).
Унаследовать корову, свинью, овцу, быка и козла от животного.
*/



public class Solution
{
    public static void main(String[] args)
    {
        Cow cow = new Cow(true,"btue",10,10,"Lulu");
        Pig pig = new Pig(true,"btue",10,10,"Lulu");
        Sheep sheep = new Sheep(true,"btue",10,10,"Lulu");
        Bull bull = new Bull(true,"btue",10,10,"Lulu");
        Goat goat = new Goat(true,"btue",10,10,"Lulu");
    }

    public static class Animal {
        boolean sex;
        String color;
        int age;
        int weight;

        public Animal(boolean sex, String color, int age, int weight)
        {
            this.sex = sex;
            this.color = color;
            this.age = age;
            this.weight = weight;
        }
    }

    public static class Cow extends Animal
    {
        String name;

        public Cow(boolean sex, String color, int age, int weight, String name)
        {
            super(sex, color, age, weight);
            this.name = name;
        }
    }

    public static class Pig extends Animal
    {
        String name;

        public Pig(boolean sex, String color, int age, int weight, String name)
        {
            super(sex, color, age, weight);
            this.name = name;
        }
    }

    public static class Sheep extends Animal
    {
        String name;

        public Sheep(boolean sex, String color, int age, int weight, String name)
        {
            super(sex, color, age, weight);
            this.name = name;
        }
    }

    public static class Bull extends Animal
    {
        String name;

        public Bull(boolean sex, String color, int age, int weight, String name)
        {
            super(sex, color, age, weight);
            this.name = name;
        }
    }

    public static class Goat extends Animal
    {
        String name;

        public Goat(boolean sex, String color, int age, int weight, String name)
        {
            super(sex, color, age, weight);
            this.name = name;
        }
    }

}
