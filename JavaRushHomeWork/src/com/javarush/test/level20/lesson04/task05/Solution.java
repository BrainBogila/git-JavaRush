 package com.javarush.test.level20.lesson04.task05;

 import java.io.IOException;
 import java.io.ObjectInputStream;
 import java.io.ObjectOutputStream;
 import java.io.Serializable;

 /* Как сериализовать что-то свое?
 Сделайте так, чтобы сериализация класса Object была возможной
 */
public class Solution {
    public static class Object implements Serializable {
        public String string1;
        public String string2;
    }

    public static int countStrings;

    public static class String implements Serializable {
        private final int number;

        public String() {
            number = ++countStrings;
        }

        private String(int number) {
            this.number = number;
        }

        public void print() {
            System.out.println("string #" + number);
        }

        public void serializeString (ObjectOutputStream oos) throws IOException
        {
            oos.writeInt(number);
        }

        public String deserializeString (ObjectInputStream ois) throws IOException
        {
            return new String(ois.readInt());
        }


    }
}
