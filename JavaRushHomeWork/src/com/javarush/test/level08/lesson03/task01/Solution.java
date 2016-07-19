package com.javarush.test.level08.lesson03.task01;

/* HashSet из растений
Создать коллекцию HashSet с типом элементов String.
Добавить в неё 10 строк: арбуз, банан, вишня, груша, дыня, ежевика, жень-шень, земляника, ирис, картофель.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.
Посмотреть, как изменился порядок добавленных элементов.
*/

import java.util.HashSet;
import java.util.Set;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        Set<String> staff = new HashSet<String>();
        staff.add("арбуз");
        staff.add("банан");
        staff.add("вишня");
        staff.add("груша");
        staff.add("дыня");
        staff.add("ежевика");
        staff.add("жень-шень");
        staff.add("земляника");
        staff.add("ирис");
        staff.add("картофель");

        for (String s:staff){
            System.out.println(s);
        }

    }
}
