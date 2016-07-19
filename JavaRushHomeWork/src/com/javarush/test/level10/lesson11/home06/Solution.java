package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Human One = new Human("Vova");
        Human Two = new Human("Nastya",20);
        Human Tree = new Human(true,20,Two);
        Human Four = new Human(false,One);
        Human Five = new Human("Kerya",Tree);
        Human Six = new Human("Toha",true);
        Human Seven = new Human("Misha",21,true);
        Human Eight = new Human("Igor",20,true,Two,Six);
        Human Nine = new Human("Dasha",21,false,Five);
        Human Ten = new Human("Vika",20,false,Seven,Four,Eight);
    }

    public static class Human
    {
        String firstName;
        int age;
        boolean sex;
        Human marred;
        Human kid;
        Human friend;

        public Human(String firstName, int age, boolean sex, Human marred, Human kid, Human friend)
        {
            this.firstName = firstName;
            this.age = age;
            this.sex = sex;
            this.marred = marred;
            this.kid = kid;
            this.friend = friend;
        }

        public Human(String firstName, int age, boolean sex, Human marred)
        {
            this.firstName = firstName;
            this.age = age;
            this.sex = sex;
            this.marred = marred;
        }

        public Human(String firstName, int age, boolean sex, Human marred, Human kid)
        {
            this.firstName = firstName;
            this.age = age;
            this.sex = sex;
            this.marred = marred;
            this.kid = kid;
        }

        public Human(String firstName, int age, boolean sex)
        {
            this.firstName = firstName;
            this.age = age;
            this.sex = sex;
        }

        public Human(String firstName, boolean sex)
        {
            this.firstName = firstName;
            this.sex = sex;
        }

        public Human(String firstName, Human friend)
        {
            this.firstName = firstName;
            this.friend = friend;
        }

        public Human(boolean sex, Human friend)
        {
            this.sex = sex;
            this.friend = friend;
        }

        public Human(boolean sex, int age, Human friend)
        {
            this.sex = sex;
            this.age = age;
            this.friend = friend;
        }

        public Human(String firstName, int age)
        {
            this.firstName = firstName;
            this.age = age;
        }

        public Human(String firstName)
        {
            this.firstName = firstName;
        }
    }
}
