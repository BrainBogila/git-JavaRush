package com.javarush.test.level11.lesson06.task05;

/* ИТ-компания
Написать девять классов: Worker(сотрудник), Clerk (клерк), IT (ИТ-специалист), Programmer(программист), ProjectManager(менеджер проекта), CTO(технический директор), HR(рекрутер), OfficeManager(офис-менеджер), Cleaner (уборщик).
Унаследовать программиста, менеджера проекта и технического директора от ИТ-специалиста.
Унаследовать рекрутера, уборщика и офис-менеджера от клерка.
Унаследовать клерка и ИТ-специалиста от сотрудника.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Clerk clerk = new Clerk(99,10,40);
        IT it = new IT(99,15,5);
        HR hr = new HR(99,15,40,"name");
        Cleaner cleaner = new Cleaner(70,7,30,"Monya");
        OfficeManager officeManager = new OfficeManager(95,10,40,"Lolo");
        Programmer programmer = new Programmer(90,10,5,"Gogi");
        ProjectManager projectManager = new ProjectManager(99,20,10,"f");
        CTO cto = new CTO(99,20,20,"c");
    }

    public static class Worker {
        int IQ;

        public Worker(int IQ)
        {
            this.IQ = IQ;
        }
    }

    public static class Clerk extends Worker {
        int payment;
        int hours;

        public Clerk(int IQ, int payment, int hours)
        {
            super(IQ);
            this.payment = payment;
            this.hours = hours;
        }
    }

    public static class IT extends Worker {
        int payment;
        int experience;

        public IT(int IQ, int payment, int experience)
        {
            super(IQ);
            this.payment = payment;
            this.experience = experience;
        }
    }

    public static class Programmer extends IT {
        String name;


        public Programmer(int IQ, int payment, int experience, String name)
        {
            super(IQ, payment, experience);
            this.name = name;
        }
    }

    public static class ProjectManager extends IT{
        String  name;

        public ProjectManager(int IQ, int payment, int experience, String name)
        {
            super(IQ, payment, experience);
            this.name = name;
        }
    }

    public static class CTO extends IT {
        String name;

        public CTO(int IQ, int payment, int experience, String name)
        {
            super(IQ, payment, experience);
            this.name = name;
        }
    }

    public static class OfficeManager extends Clerk {
        String name;

        public OfficeManager(int IQ, int payment, int hours, String name)
        {
            super(IQ, payment, hours);
            this.name = name;
        }
    }

    public static class HR extends Clerk {
        String name;

        public HR(int IQ, int payment, int hours, String name)
        {
            super(IQ, payment, hours);
            this.name = name;
        }
    }

    public static class Cleaner extends Clerk {
        String name;

        public Cleaner(int IQ, int payment, int hours, String name)
        {
            super(IQ, payment, hours);
            this.name = name;
        }
    }
}
