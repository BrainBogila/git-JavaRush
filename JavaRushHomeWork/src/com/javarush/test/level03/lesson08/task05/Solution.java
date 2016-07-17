package com.javarush.test.level03.lesson08.task05;

/* Чистая любовь
Ввести с клавиатуры три имени, вывести на экран надпись:
name1 + name2 + name3 = Чистая любовь, да-да!
Пример: Вася + Ева + Анжелика = Чистая любовь, да-да!
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        String n1,n2,n3;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n1 = br.readLine();
        n2 = br.readLine();
        n3 = br.readLine();
        System.out.println(n1+" + "+n2+" + "+n3+" = Чистая любовь, да-да!");

    }
}