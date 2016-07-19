package com.javarush.test.level09.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/* Задача по алгоритмам
Задача: Пользователь вводит с клавиатуры список слов (и чисел). Слова вывести в возрастающем порядке, числа - в убывающем.
Пример ввода:
Вишня
1
Боб
3
Яблоко
2
0
Арбуз
Пример вывода:
Арбуз
3
Боб
2
Вишня
1
0
Яблоко
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true)
        {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array)
        {
            System.out.println(x);
        }
    }

    public static void sort(String[] array)
    {
        ArrayList<String> list2 = new ArrayList<String>();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        for (String x:array){
            if (isNumber(x)){
                int num = Integer.parseInt(x);
                list1.add(num);
            }
            else
                list2.add(x);

        }
        Integer[] list11 = list1.toArray(new Integer[list1.size()]);
        for (int i = 0;i<list11.length;i++){
            for (int j = i;j<list11.length;j++){
                if (list11[i] < list11[j]){
                    int t = list11[i];
                    list11[i] = list11[j];
                    list11[j] = t;
                }
            }
        }

        String[] list22 = list2.toArray(new String[list2.size()]);
        Arrays.sort(list22);

        /*for (int i = 0;i<list22.length;i++){
            for (int j = i;j<list22.length;j++){
                if (isGreaterThen(list22[j],list22[i])){
                    int t = list11[i];
                    list11[i] = list11[j];
                    list11[j] = t;
                }
            }
        }
        */

        int j = 0;
        int t = 0;
        for (int i = 0;i<array.length;i++){
            if (isNumber(array[i])){
                array[i] = (Integer.toString(list11[j]));
                j++;
            }
            else {
                array[i] = list22[t];
                t++;
            }
        }
    }

    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThen(String a, String b)
    {
        return a.compareTo(b) > 0;
    }


    //строка - это на самом деле число?
    public static boolean isNumber(String s)
    {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++)
        {
            char c = chars[i];
            if ((i != 0 && c == '-') //есть '-' внутри строки
                    || (!Character.isDigit(c) && c != '-') ) // не цифра и не начинается с '-'
            {
                return false;
            }
        }
        return true;
    }
}
