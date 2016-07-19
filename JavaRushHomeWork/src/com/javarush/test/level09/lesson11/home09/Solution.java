package com.javarush.test.level09.lesson11.home09;

import java.util.*;

/* Десять котов
Создать класс кот – Cat, с полем «имя» (String).
Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех имен и вывести его на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap()
    {
        //Напишите тут ваш код
        TreeMap<String,Cat> map = new TreeMap<>();
        map.put("Vova1",new Cat("Vova1"));
        map.put("Vova2",new Cat("Vova2"));
        map.put("Vova3",new Cat("Vova3"));
        map.put("Vova4",new Cat("Vova4"));
        map.put("Vova5",new Cat("Vova5"));
        map.put("Vova6",new Cat("Vova6"));
        map.put("Vova7",new Cat("Vova7"));
        map.put("Vova8",new Cat("Vova8"));
        map.put("Vova9",new Cat("Vova9"));
        map.put("Vova10",new Cat("Vova10"));
        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map)
    {
        Set<Cat> set = new HashSet<>();
       Set<Map.Entry<String,Cat>> set1 = map.entrySet();
        for (Map.Entry<String,Cat> x:set1){
            Cat cat = x.getValue();
            set.add(cat);
        }
        return set;
    }

    public static void printCatSet(Set<Cat> set)
    {
        for (Cat cat:set)
        {
            System.out.println(cat);
        }
    }

    public static class Cat
    {
        private String name;

        public Cat(String name)
        {
            this.name = name;
        }

        public String toString()
        {
            return "Cat "+this.name;
        }
    }


}
