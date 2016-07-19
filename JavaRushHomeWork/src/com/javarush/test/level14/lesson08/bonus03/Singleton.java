package com.javarush.test.level14.lesson08.bonus03;

/**
 * Created by Стас on 20.04.2015.
 */
public class Singleton {
    private static Singleton sing;


    public static Singleton getInstance(){
        if (sing == null){
            sing = new Singleton();
        }
        return sing;
    }
}
