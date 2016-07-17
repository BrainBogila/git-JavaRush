package com.javarush.test.level08.lesson08.task05;

import java.util.HashMap;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        //Напишите тут ваш код
        HashMap<String,String> dictionary = new HashMap<String, String>();
        dictionary.put("f1","name");
        dictionary.put("f2","name");
        dictionary.put("f3","name");
        dictionary.put("f4","name");
        dictionary.put("f5","name");
        dictionary.put("f6","name");
        dictionary.put("f7","name");
        dictionary.put("f8","name");
        dictionary.put("f9","name");
        dictionary.put("f10","name");

        return dictionary;


    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        //Напишите тут ваш код
        String value;
        int counter = 0;
        HashMap<String, String> map1 = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : map1.entrySet())
        {
            value = pair.getValue();
            for (Map.Entry<String, String> pair1 : map1.entrySet())
            {
                if (value.equals(pair1.getValue())) counter++;
            }
            if (counter >= 2)
            {
                removeItemFromMapByValue(map, value);
                counter = 0;
            }
        }

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
