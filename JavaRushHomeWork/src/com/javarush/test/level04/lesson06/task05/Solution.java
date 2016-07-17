package com.javarush.test.level04.lesson06.task05;

/* 18+
Ввести с клавиатуры имя и возраст. Если возраст меньше 18 вывести надпись «Подрасти еще».
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        String name,age;
        int age1;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        name = br.readLine();
        age = br.readLine();
        age1 = Integer.parseInt(age);
        if (age1 < 18) System.out.println("Подрасти еще");

    }
}
