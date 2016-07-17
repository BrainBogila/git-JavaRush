package com.javarush.test.level11.lesson11.home01;

/* Адам и Ева
Написать два класса Adam(Адам) и Eve(Ева).
Унаследовать Еву от Адама.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Eve eve = new Eve(20,12432,160,3);
        Adam adam = new Adam(25,21321,190);
    }

    //Адам
    public static class Adam {
        int age;
        int hearColor;
        int height;

        public Adam(int age, int hearColor, int height)
        {
            this.age = age;
            this.hearColor = hearColor;
            this.height = height;
        }
    }

    //Ева
    public static class Eve extends Adam {
        int boobsSize;

        public Eve(int age, int hearColor, int height, int boobsSize)
        {
            super(age, hearColor, height);
            this.boobsSize = boobsSize;
        }
    }
}
