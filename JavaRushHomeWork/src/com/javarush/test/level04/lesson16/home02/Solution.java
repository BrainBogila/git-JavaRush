package com.javarush.test.level04.lesson16.home02;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        String a,b,c;
        int a1,b1,c1;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        a = br.readLine();
        b = br.readLine();
        c = br.readLine();
        a1 = Integer.parseInt(a);
        b1 = Integer.parseInt(b);
        c1 = Integer.parseInt(c);
        if (a1 < b1 && a1 > c1) System.out.println(a1);
        else if (a1 < c1 && a1 > c1) System.out.println(a1);
        else if (b1 < a1 && b1 > c1) System.out.println(b1);
        else if (b1 < c1 && b1 > a1) System.out.println(b1);
        else System.out.println(c1);

    }
}
