package com.javarush.test.level05.lesson09.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя конструкторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    public String dogname,color;
    int hight;

    Dog(String name){
        this.dogname = name;
    }

    Dog(String name,int hight){
        this.dogname = name;
        this.hight = hight;
    }

    Dog(String name,int hight,String color){
        this.dogname = name;
        this.hight = hight;
        this.color = color;
    }


}
