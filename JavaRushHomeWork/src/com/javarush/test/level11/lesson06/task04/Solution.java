package com.javarush.test.level11.lesson06.task04;

/* Все мы работники
Написать четыре класса: Worker(сотрудник), Manager(управляющий), Chief(директор) и  Secretary(секретарь).
Унаследовать управляющего, директора и секретаря от сотрудника.
*/

public class Solution
{
    public class Manager extends Worker {
        int payment;

        public Manager(String name, int score, int payment)
        {
            super(name, score);
            this.payment = payment;
        }
    }

    public class Chief extends Worker {
        int payment;

        public Chief(String name, int score, int payment)
        {
            super(name, score);
            this.payment = payment;
        }
    }

    public class Worker {
        String name;
        int score;

        public Worker(String name, int score)
        {
            this.name = name;
            this.score = score;
        }
    }

    public class Secretary extends Worker {
        int payment;

        public Secretary(String name, int score, int payment)
        {
            super(name, score);
            this.payment = payment;
        }
    }
}
