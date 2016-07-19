package com.javarush.test.level13.lesson11.home04;

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести все строки в файл, каждую строчку с новой стороки.
*/


import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> arrayList = new ArrayList<>();
        String fileName = reader.readLine();
        try(FileWriter file = new FileWriter(fileName)) {
        while (true)
        {
            String str = reader.readLine();
            arrayList.add(str);
            if (str.equals("exit")) break;
        }

        for (String st : arrayList) {
            file.write(st);
            file.append(System.lineSeparator());
        }
    }
        catch (IOException e){
            System.out.println(e.toString());
        }

    }
}
