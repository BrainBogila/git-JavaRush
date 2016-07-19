package com.javarush.test.level11.lesson06.task01;

/* Лошадь и пегас
Написать два класса: Horse (лошадь) и Pegas (пегас).
Унаследовать пегаса от лошади.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Pegas pegas1 = new Pegas(true,10,"Glory","black",2);
    }

    public static class Horse
    {
        String name,color;
        int age;
        boolean sex;

        public Horse(boolean sex, int age, String name, String color)
        {
            this.sex = sex;
            this.age = age;
            this.name = name;
            this.color = color;
        }
    }

    public static class Pegas extends Horse
    {
        int winglengh;

        public Pegas(boolean sex, int age, String name, String color, int winglengh)
        {
            super(sex, age, name, color);
            this.winglengh = winglengh;
        }
    }
}
