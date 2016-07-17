package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{

    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Сталлоне", new Date("JUNE 1 1980"));
        map.put("f2",new Date("JUNE 1 1980"));
        map.put("f3",new Date("JULY 1 1980"));
        map.put("f4",new Date("FEB 1 1980"));
        map.put("f5",new Date("NOV 1 1980"));
        map.put("f6",new Date("JUNE 1 1980"));
        map.put("f7",new Date("DEC 1 1980"));
        map.put("f8",new Date("JUNE 1 1980"));
        map.put("f9",new Date("OCT 1 1980"));
        map.put("f10",new Date("AUGUST 1 1980"));

        //Напишите тут ваш код
        return map;

    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        //Напишите тут ваш код
        Iterator<Map.Entry<String,Date>> iter = map.entrySet().iterator();
        while (iter.hasNext()){
            Map.Entry<String,Date> n = iter.next();
            int month = n.getValue().getMonth();
            if (month<8&&month>4) iter.remove();
        }
    }
}
