package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;
import java.util.List;

public class Solution
{
    public static void main(String[] args)
    {
        //Написать тут ваш код
        ArrayList<Human> children1 = new ArrayList<Human>();
        Human child1 = new Human("child",false,10,new ArrayList<Human>());
        Human child2 = new Human("child",false,10,new ArrayList<Human>());
        Human child3 = new Human("child",false,10,new ArrayList<Human>());
        children1.add(child1);
        children1.add(child2);
        children1.add(child3);
        Human mom = new Human("mom",false,30,children1);
        Human dad = new Human("dad",false,30,children1);
        ArrayList<Human> children2 = new ArrayList<Human>();
        children2.add(mom);
        children2.add(dad);
        Human grandpa1 = new Human("ded",true,70,children2);
        Human grandma1 = new Human("baba",false,70,children2);
        Human grandpa2 = new Human("ded",true,70,children2);
        Human grandma2 = new Human("baba",false,70,children2);

        System.out.println(grandma1);
        System.out.println(grandpa1);
        System.out.println(grandma2);
        System.out.println(grandpa2);
        System.out.println(mom);
        System.out.println(dad);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
    }

    public static class Human
    {
        //Написать тут ваш код
        String name;
        boolean sex;
        int age;
        List<Human> children;

        public Human(String name,boolean sex,int age,ArrayList<Human> children){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
