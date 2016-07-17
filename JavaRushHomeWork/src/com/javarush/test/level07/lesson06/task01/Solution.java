package com.javarush.test.level07.lesson06.task01;

/* 5 различных строчек в списке
1. Создай список строк.
2. Добавь в него 5 различных строчек.
3. Выведи его размер на экран.
4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        ArrayList<String > ar = new ArrayList<String>();
        ar.add("1");
        ar.add("2");
        ar.add("3");
        ar.add("4");
        ar.add("5");
        System.out.println(ar.size());
        for (int i = 0;i<ar.size();i++){
            System.out.println(ar.get(i));
        }

    }
}
