package com.javarush.test.level11.lesson11.home04;

/* Религии
Написать три класса: Judaism(Иудаизм), Christianity(Христианство), Islam(Мусульманство)
Унаследовать христианство от иудаизма и мусульманство от христианства.
*/

public class Solution
{
    public static void main(String[] args)
    {
    }

    public class Judaism {
        private boolean trust;

        public Judaism(boolean trust)
        {
            this.trust = trust;
        }
    }

    public class Christianity extends Judaism{
        private int count;

        public Christianity(boolean trust, int count)
        {
            super(trust);
            this.count = count;
        }
    }

    public class Islam extends Christianity {
        private int church;

        public Islam(boolean trust, int count, int church)
        {
            super(trust, count);
            this.church = church;
        }
    }

}
