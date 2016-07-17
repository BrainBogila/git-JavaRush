package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args)
    {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Human grandpa1 = new Human("Vova",true,61);
        Human grandpa2 = new Human("Misha",true,62);
        Human grandma1 = new Human("Zoya",false,61);
        Human grandma2 = new Human("Luda",false,62);
        Human father = new Human("Maks",true,30,grandpa1,grandma1);
        Human mother = new Human("Alina",false,28,grandpa2,grandma2);
        Human child1 = new Human("Petro",true,15,father,mother);
        Human child2 = new Human("Vitya",true,13,father,mother);
        Human child3 = new Human("Masha",false,14,father,mother);

        System.out.println(grandpa1);
        System.out.println(grandpa2);
        System.out.println(grandma1);
        System.out.println(grandma2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
    }

    public static class Human
    {
        String name;
        int age;
        boolean sex;
        Human father;
        Human mother;

        Human(String name,boolean sex,int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = null;
            this.mother = null;
        }
        Human(String name,boolean sex,int age, Human father,Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }
        //Написать тут ваш код

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
