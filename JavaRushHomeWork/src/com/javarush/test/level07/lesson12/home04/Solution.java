package com.javarush.test.level07.lesson12.home04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Вводить с клавиатуры строки, пока пользователь не введёт строку 'end'
Создать список строк.
Ввести строки с клавиатуры и добавить их в список.
Вводить с клавиатуры строки, пока пользователь не введёт строку "end".  "end" не учитывать.
Вывести строки на экран, каждую с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //Напишите тут ваш код
        ArrayList<String> st = new ArrayList<String>();
        boolean i = true;
        int counter = 0;
        while (i){
            st.add(reader.readLine());
            if (st.get(counter).equals("end")){ i = false; st.remove(counter);}
            else counter++;
        }

        for (int j = 0;j<st.size();j++){
            System.out.println(st.get(j));
        }
    }
}
