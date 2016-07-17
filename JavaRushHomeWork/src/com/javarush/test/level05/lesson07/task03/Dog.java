package com.javarush.test.level05.lesson07.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя инициализаторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog {

    String name, colour;
    int tall;

    public void initialize( String name) {
        this.name = name;
    }
    public void initialize (String name, int tall) {
        this.name = name;
        this.tall = tall;
    }
    public  void initialize (String name, int tall, String colour) {
        this.tall = tall;
        this.name = name;
        this.colour = colour;
    }
}
