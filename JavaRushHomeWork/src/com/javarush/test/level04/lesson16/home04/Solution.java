package com.javarush.test.level04.lesson16.home04;

/* Меня зовут 'Вася'...
Ввести с клавиатуры строку name.
Ввести с клавиатуры дату рождения (три числа): y, m, d.
Вывести на экран текст:
«Меня зовут name
Я родился d.m.y»
Пример:
Меня зовут Вася
Я родился 15.2.1988
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        String name,y,m,d;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        name = br.readLine();
        y = br.readLine();
        m = br.readLine();
        d = br.readLine();
        System.out.println("Меня зовут "+name+"\nЯ родился "+d+"."+m+"."+y);

    }
}
