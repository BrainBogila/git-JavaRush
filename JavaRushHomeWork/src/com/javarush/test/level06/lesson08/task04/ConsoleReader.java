package com.javarush.test.level06.lesson08.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Класс ConsoleReader
Сделать класс ConsoleReader, у которого будут 4 статических метода:
String readString() – читает с клавиатуры строку
int readInt() – читает с клавиатуры число
double readDouble() – читает с клавиатуры дробное число
void readLn() – ждет нажатия enter [использовать readString()]
*/

public class ConsoleReader
{

    public static String readString() throws Exception
    {
        //Напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st = br.readLine();
        return st;

    }

    public static int readInt() throws Exception
    {
        //Напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        return num;
    }

    public static double readDouble() throws Exception
    {
        //Напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double num = Double.parseDouble(br.readLine());
        return num;
    }

    public static void readLn() throws Exception
    {
        //Напишите тут ваш код
         ConsoleReader.readString();

    }
}
