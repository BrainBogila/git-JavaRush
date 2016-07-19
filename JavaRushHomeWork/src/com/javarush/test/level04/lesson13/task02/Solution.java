package com.javarush.test.level04.lesson13.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Рисуем прямоугольник
Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
Пример: m=2, n=4
8888
8888
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        String m,n;
        int m1,n1;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        m = br.readLine();
        n = br.readLine();
        m1 = Integer.parseInt(m);
        n1 = Integer.parseInt(n);
        for (int i = 0; i < m1; i++){
            System.out.println();
            for (int j = 0; j < n1;j++)
                System.out.print("8");
        }

    }
}
