package com.javarush.test.level07.lesson09.task03;


import java.util.ArrayList;
import java.util.Collections;


/* Слово «именно»
1. Создай список из слов «мама», «мыла», «раму».
2. После каждого слова вставь в список строку, содержащую слово «именно».
3. Используя цикл for вывести результат на экран, каждый элемент списка с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        ArrayList<String > st = new ArrayList<String>();
        Collections.addAll(st,"мама","мыла","раму");
        st.add(1,"именно");
        st.add(3,"именно");
        st.add(5,"именно");
        for (String x:st){
            System.out.println(x);
        }

    }
}
