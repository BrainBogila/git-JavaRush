package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        String a,b,c,d;
        int a1,b1,c1,d1,max,max1,max2;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        a = br.readLine();
        b = br.readLine();
        c = br.readLine();
        d = br.readLine();
        a1 = Integer.parseInt(a);
        b1 = Integer.parseInt(b);
        c1 = Integer.parseInt(c);
        d1 = Integer.parseInt(d);
        if (a1 < b1) max1 = b1;
                else max1 = a1;
        if (c1 < d1) max2 = d1;
            else max2 = c1;
        if (max1 > max2) max = max1;
        else max = max2;
        System.out.println(max);
    }
}
