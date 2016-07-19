package com.javarush.test.level06.lesson11.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Нужно добавить в программу новую функциональность
Задача: У каждой кошки есть имя и кошка-мама. Создать класс, который бы описывал данную ситуацию. Создать два объекта: кошку-дочь и кошку-маму. Вывести их на экран.
Новая задача: У каждой кошки есть имя, кошка-папа и кошка-мама. Изменить класс Cat так, чтобы он мог описать данную ситуацию.
Создать 6 объектов: маму, папу, сына, дочь, бабушку(мамина мама) и дедушку(папин папа).
Вывести их всех на экран в порядке: дедушка, бабушка, папа, мама, сын, дочь.

Пример ввода:
дедушка Вася
бабушка Мурка
папа Котофей
мама Василиса
сын Мурчик
дочь Пушинка

Пример вывода:
Cat name is дедушка Вася, no mother, no father
Cat name is бабушка Мурка, no mother, no father
Cat name is папа Котофей, no mother, father is дедушка Вася
Cat name is мама Василиса, mother is бабушка Мурка, no father
Cat name is сын Мурчик, mother is мама Василиса, father is папа Котофей
Cat name is дочь Пушинка, mother is мама Василиса, father is папа Котофей
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        String grandFatherName = reader.readLine();
        Cat grandFather = new Cat(grandFatherName);

        String grandMotherName = reader.readLine();
        Cat grandMother = new Cat(grandMotherName);

        String FatherName = reader.readLine();
        Cat Father = new Cat(FatherName,grandFather,null);

        String MotherName = reader.readLine();
        Cat Mother = new Cat(MotherName,null,grandMother);

        String SonName = reader.readLine();
        Cat Son = new Cat(SonName,Father,Mother);

        String DaughterName = reader.readLine();
        Cat Daughter = new Cat(DaughterName,Father,Mother);

        System.out.println(grandFather);
        System.out.println(grandMother);
        System.out.println(Father);
        System.out.println(Mother);
        System.out.println(Son);
        System.out.println(Daughter);
    }

    public static class Cat
    {
        private String name;
        private Cat father;
        private Cat mother;

        Cat(String name) {
            this.name = name;
            this.father = null;
            this.mother = null;

        }

        Cat(String name, Cat father, Cat mother) {
            this.name = name;
            this.father = father;
            this.mother = mother;
        }

        @Override
        public String toString()
        {
            String output ="";
            if (father == null&&mother==null)
                output = ("Cat name is " + name + ", no mother, no father ");
            else if (mother==null)
                output = ("Cat name is " + name + ", no mother, father is " + father.name);
            else if (father==null)
                output = ("Cat name is " + name + ", mother is "+mother.name+", no father");

            else output = ("Cat name is "+name+", mother is "+mother.name+", father is "+father.name);


            return output;
        }
    }

}
