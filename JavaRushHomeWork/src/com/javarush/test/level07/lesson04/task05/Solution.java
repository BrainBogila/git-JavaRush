package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        int numArr[] = new int[20];
        int m1[] = new int[10];
        int m2[] = new int[10];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0;i < numArr.length;i++){
            numArr[i] = Integer.parseInt(br.readLine());
        }
        int j = 0;
        for (int i = 0;i < numArr.length;i++){
            if (i < 10) m1[i] = numArr[i];
            else
            {
                m2[j] = numArr[i];
                System.out.println(m2[j]);
                j++;
            }
        }
    }
}
