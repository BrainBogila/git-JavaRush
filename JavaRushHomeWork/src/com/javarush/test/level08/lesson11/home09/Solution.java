package com.javarush.test.level08.lesson11.home09;

import java.text.SimpleDateFormat;
import java.util.Date;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args)
    {
    }

    public static boolean isDateOdd(String date)
    {
       /* Date date1 = new Date(date);
        Date date2 = new Date();
        long d = date1.getTime();
        date2.setHours(0);
        date2.setMinutes(0);
        date2.setDate(1);
        date2.setMonth(0);
        date2.setSeconds(0);
        long days = date2.getTime() - d;
        long d3 = 24*60*60*100;
        long result = days/d3;

        return (result%2 == 0);
        */
        Date curDate = new Date(date);
        SimpleDateFormat dateFormat = new SimpleDateFormat("D");
        String dayOldFormat = dateFormat.format(curDate);
        int dayNewFormat = Integer.parseInt(dayOldFormat);
        System.out.println(dayNewFormat % 2 != 0);
        return dayNewFormat % 2 != 0;
    }
}
