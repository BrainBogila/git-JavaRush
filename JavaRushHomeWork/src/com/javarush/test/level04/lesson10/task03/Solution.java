package com.javarush.test.level04.lesson10.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Хорошего не бывает много
Ввести с клавиатуры строку и число N.
Вывести на экран строку N раз используя цикл while.
Пример ввода:
абв
2
Пример вывода:
абв
абв
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        String s,num;
        int num1;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        s = br.readLine();
        num = br.readLine();
        num1 = Integer.parseInt(num);

        while (num1 > 0){
            System.out.println(s);
            num1--;
        }
    }
}
