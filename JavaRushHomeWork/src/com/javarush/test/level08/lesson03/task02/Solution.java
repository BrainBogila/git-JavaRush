package com.javarush.test.level08.lesson03.task02;

/* HashMap из 10 пар
Создать коллекцию HashMap<String, String>, занести туда 10 пар строк:
арбуз – ягода, банан – трава, вишня – ягода, груша – фрукт, дыня – овощ, ежевика – куст, жень-шень – корень, земляника – ягода, ирис – цветок, картофель – клубень.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.
Пример вывода (тут показана только одна строка):
картофель – клубень
*/

import java.util.HashMap;
import java.util.Map;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        HashMap<String,String> st = new HashMap<String, String>(10);
        st.put("арбуз","ягода");
        st.put("банан","трава");
        st.put("вишня","ягода");
        st.put("груша","фрукт");
        st.put("дыня","овощ");
        st.put("ежевика","куст");
        st.put("жень-шень","корень");
        st.put("земляника","ягода");
        st.put("ирис","цветок");
        st.put("картофель","клубень");

        for (Map.Entry<String,String> x:st.entrySet()){
            System.out.print(x.getKey()+" - ");
            System.out.println(x.getValue());
        }

    }
}
