package com.javarush.test.level11.lesson11.home02;

/* AppleIPhone и SamsungGalaxyS2
Написать два класса AppleIPhone и SamsungGalaxyS2.
Унаследовать SamsungGalaxyS2 от AppleIPhone.
*/

public class Solution
{
    public static void main(String[] args)
    {
        SamsungGalaxyS2 samsungGalaxyS2 = new SamsungGalaxyS2(15,14,32,true);
        AppleIPhone appleIPhone = new AppleIPhone(15,14,64);
    }

    public static class AppleIPhone {
        private int size;
        private int screenSize;
        private int memory;

        public AppleIPhone(int size, int screenSize, int memory)
        {
            this.size = size;
            this.screenSize = screenSize;
            this.memory = memory;
        }
    }

    public static class SamsungGalaxyS2 extends AppleIPhone {
        private boolean PC;

        public SamsungGalaxyS2(int size, int screenSize, int memory, boolean PC)
        {
            super(size, screenSize, memory);
            this.PC = PC;
        }
    }
}
