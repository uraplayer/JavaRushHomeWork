package com.javarush.test.level08.lesson11.home04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* Минимальное из N чисел
1. Ввести с клавиатуры число N.
2. Считать N целых чисел и заполнить ими список - метод getIntegerList.
3. Найти минимальное число среди элементов списка - метод getMinimum.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array)
    {
        // Найти минимум

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.size(); i++)
        {
            if (array.get(i) < min)
                min = array.get(i);
        }

        return min;
    }

    public static List<Integer> getIntegerList() throws IOException
    {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numberN = Integer.parseInt(br.readLine());
        List<Integer> integerList = new ArrayList<Integer>();
        {
            for (int i = 0; i < numberN; i++)
            {
                integerList.add(Integer.parseInt(br.readLine()));
            }
        }
        //Тут создать и заполнить список
        return integerList;
    }
}
