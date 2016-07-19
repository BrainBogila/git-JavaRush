package com.javarush.test.level11.lesson11.home05;

/* От школьника к рабству
Написать четыре класса: Schoolboy(школьник), Student(студент), Worker(Сотрудник), Slave (Раб)
Унаследовать студента от школьника, сотрудника от студента, раба от сотрудника.
*/

public class Solution
{
    public static void main(String[] args)
    {
    }

    public class Schoolboy {
        private int age;
        private int payment;

        public Schoolboy(int age, int payment)
        {
            this.age = age;
            this.payment = payment;
        }
    }

    public class Student extends Schoolboy {
        private int IQ;

        public Student(int age, int payment, int IQ)
        {
            super(age, payment);
            this.IQ = IQ;
        }
    }

    public class Worker extends Student {
        private int workHours;

        public Worker(int age, int payment, int IQ, int workHours)
        {
            super(age, payment, IQ);
            this.workHours = workHours;
        }
    }

    public class Slave extends Worker {
        private String owner;

        public Slave(int age, int payment, int IQ, int workHours, String owner)
        {
            super(age, payment, IQ, workHours);
            this.owner = owner;
        }
    }

}
