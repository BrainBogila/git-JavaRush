package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
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

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        //Напишите тут ваш код
        int sum = 0;
        Set<Map.Entry<String,String >> set = map.entrySet();
        for (Map.Entry<String,String> value:set){
            String name1 = value.getValue();
            if (name.equals(name1)) sum++;
        }
        return sum;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String familiya)
    {
        //Напишите тут ваш код
        int sum = 0;
        Set<Map.Entry<String,String >> set = map.entrySet();
        for (Map.Entry<String,String> value:set){
            String familiya1 = value.getKey();
            if (familiya.equals(familiya1)) sum++;
        }
        return sum;
    }
}

/*
 public static HashMap<String, String> createMap() {
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

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //Напишите тут ваш код
        Iterator<HashMap.Entry <String,String>> iterator = map.entrySet().iterator();
        int sum = 0;
        while (iterator.hasNext()){
            Map.Entry<String,String> n = iterator.next();
            String name1 = n.getValue();
            if (name1.equals(name)) sum++;
        }
        return sum;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String familiya) {
        //Напишите тут ваш код
        Iterator<HashMap.Entry <String,String>> iterator = map.entrySet().iterator();
        int sum = 0;
        while (iterator.hasNext()){
            Map.Entry<String,String> n = iterator.next();
            String name1 = n.getKey();
            if (name1.equals(familiya)) sum++;
        }
        return sum;

    }
 */