package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i ;
        Boolean a = true;
        int sum = 0;
        String s;
        while(a)
        {s=reader.readLine();
            if(!s.equals("сумма"))
            { i=Integer.parseInt(s);
            sum = sum+i;}
            else a=false;
        }
        System.out.println(sum);
    }
}
