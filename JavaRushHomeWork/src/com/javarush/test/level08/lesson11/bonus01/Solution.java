package com.javarush.test.level08.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
January February March April May June July August September October November December
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        //add your code here - напиши код тут
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String month = br.readLine();
        HashMap<String,Integer> mon = new HashMap<String,Integer>();
        mon.put("January",1);
        mon.put("February",2);
        mon.put("March",3);
        mon.put("April",4);
        mon.put("May",5);
        mon.put("June",6);
        mon.put("July",7);
        mon.put("August",8);
        mon.put("September",9);
        mon.put("October",10);
        mon.put("November",11);
        mon.put("December",12);
        Integer n = mon.get(month);
        System.out.println(month+" is "+n+" month");
    }

}
