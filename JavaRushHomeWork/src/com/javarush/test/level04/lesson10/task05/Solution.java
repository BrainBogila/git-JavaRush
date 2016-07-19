package com.javarush.test.level04.lesson10.task05;

/* Таблица умножения
Вывести на экран таблицу умножения 10х10 используя цикл while.
Числа разделить пробелом.
1 2 3 4 5 6 7 8 9 10
2 4 6 8 10 12 14 16 18 20
...
*/

public class Solution
{
    public static void main(String[] args) throws Exception {
        int a = 1,b = 2,c = 3,d = 4,e = 5,f = 6,j = 7,h = 8,i = 9,g = 10;
        while (a < 11){
            System.out.print(a + " ");
            ++a;
        }
        System.out.println();
        while (b < 21){
            System.out.print(b + " ");
            b+=2;
        }
        System.out.println();
        while (c < 31){
            System.out.print(c + " ");
            c+=3;
        }
        System.out.println();
        while (d < 41){
            System.out.print(d + " ");
            d+=4;
        }
        System.out.println();
        while (e < 51){
            System.out.print(e + " ");
            e+=5;
        }
        System.out.println();
        while (f < 61){
            System.out.print(f + " ");
            f+=6;
        }
        System.out.println();
        while (j < 71){
            System.out.print(j + " ");
            j+=7;
        }
        System.out.println();
        while (h < 81){
            System.out.print(h + " ");
            h+=8;
        }
        System.out.println();
        while (i < 91){
            System.out.print(i + " ");
            i+=9;
        }
        System.out.println();
        while (g <= 100){
            System.out.print(g+" ");
            g+=10;
        }

    }
}
