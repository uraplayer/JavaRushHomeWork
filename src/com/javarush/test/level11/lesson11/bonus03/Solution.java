package com.javarush.test.level11.lesson11.bonus03;

/* Задача по алгоритмам
Написать метод, который возвращает минимальное и максимальное числа в массиве.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

        Pair<Integer, Integer> result = getMinimumAndMaximum(data);

        System.out.println("Minimum is " + result.x);
        System.out.println("Maximum is " + result.y);
    }

    public static Pair<Integer, Integer> getMinimumAndMaximum(int[] array)
    {
        if (array == null || array.length == 0)
        {
            return new Pair<Integer, Integer>(null, null);
        }

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        int tempMAX = 0;
        int tempMIN = 0;

        for (int i = 0; i < array.length; i++)
        {

            if (array[i] < max)
                tempMIN = array[i];
            max = tempMIN;

            if (array[i] > min)
                tempMAX = array[i];
            min = tempMAX;

        }

        return new Pair<Integer, Integer>(tempMIN, tempMAX);
    }


    public static class Pair<X, Y>
    {
        public X x;
        public Y y;

        public Pair(X x, Y y)
        {
            this.x = x;
            this.y = y;
        }
    }
}
