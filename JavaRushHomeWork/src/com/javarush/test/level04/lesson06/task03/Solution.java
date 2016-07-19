package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        String a,b,c;
        int a1,b1,c1,min;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        a = br.readLine();
        b = br.readLine();
        c = br.readLine();
        a1 = Integer.parseInt(a);
        b1 = Integer.parseInt(b);
        c1 = Integer.parseInt(c);

        if (a1 < b1 && a1 < c1) {
            min = a1;
            if (b1<c1) System.out.print(c1+" "+b1+" "+min);
            else System.out.println(b1+" "+c1+" "+min);
        }
        else if (b1 < a1 && b1 < c1) {
            min = b1;
            if (a1<c1) System.out.println(c1+" "+a1+" "+min);
            else System.out.println(a1+" "+c1+" "+min);
        }
        else  if (c1 < b1 && c1 < a1) {
            min = c1;
            if (b1<a1) System.out.println(a1+" "+b1+" "+min);
            else System.out.println(b1+" "+a1+" "+min);
        }

    }
}
