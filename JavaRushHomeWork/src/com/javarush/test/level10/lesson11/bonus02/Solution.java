package com.javarush.test.level10.lesson11.bonus02;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* Нужно добавить в программу новую функциональность
Задача: Программа вводит с клавиатуры пару (число и строку) и выводит их на экран.
Новая задача: Программа вводит с клавиатуры пары (число и строку), сохраняет их в HashMap.
Пустая строка – конец ввода данных. Числа могу повторяться. Строки всегда уникальны. Введенные данные не должны потеряться!
Затем программа выводит содержание HashMap на экран.

Пример ввода:
1
Мама
2
Рама
1
Мыла

Пример вывода:
1 Мама
2 Рама
1 Мыла
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String,Integer> hashMap = new HashMap<>();

        while (true) {
            String id = reader.readLine();
            if (id.isEmpty()) break;
            int num = Integer.parseInt(id);
            String name = reader.readLine();
            hashMap.put(name,num);
        }

        Set<Map.Entry<String,Integer>> set = hashMap.entrySet();
        for (Map.Entry<String,Integer> x:set){
            System.out.print(x.getValue()+" ");
            System.out.println(x.getKey());
        }
    }
}
