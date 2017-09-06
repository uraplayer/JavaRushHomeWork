package com.javarush.test.level04.lesson07.task04;

/* Положительные и отрицательные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и количество отрицательных чисел в исходном наборе,
в следующем виде:
"количество отрицательных чисел: а", "количество положительных чисел: б", где а, б - искомые значения.
Пример для чисел 2 5 6:
количество отрицательных чисел: 0
количество положительных чисел: 3
Пример для чисел -2 -5 6:
количество отрицательных чисел: 2
количество положительных чисел: 1
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
        int countP =0;
        int countN =0;


        if (a > 0)   countP++; else countN++;
        if (b > 0)   countP++; else countN++;
        if (c > 0)   countP++; else countN++;
        System.out.println("количество отрицательных чисел: " + countN);
        System.out.println("количество положительных чисел: " + countP);



    }
}
