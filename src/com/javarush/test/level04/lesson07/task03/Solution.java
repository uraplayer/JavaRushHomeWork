package com.javarush.test.level04.lesson07.task03;

/* Положительные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел в исходном наборе.
Пример для чисел -4 6 6:
2
Пример для чисел -6 -6 -3:
0
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sX = br.readLine();
        String sY = br.readLine();
        String sZ = br.readLine();
        int a = Integer.parseInt(sX);
        int b = Integer.parseInt(sY);
        int c = Integer.parseInt(sZ);
        int count =0;

        if (a > 0)   count++;
        if (b > 0)   count++;
        if (c > 0)   count++;

        System.out.println(count);

        //напишите тут ваш код

    }
}
