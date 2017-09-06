package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
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
        String sZ1 = br.readLine();

        int a = Integer.parseInt(sX);
        int b = Integer.parseInt(sY);
        int c = Integer.parseInt(sZ);   //напишите тут ваш код
        int d = Integer.parseInt(sZ1);   //напишите тут ваш код


        if (a >= b && a >= c && a >= d)
            System.out.println(a);
        else   if (b >= a && b >= c && b >= d)
            System.out.println(b);
        else   if (c >= a && c >= b && c >= d)
            System.out.println(c);
        else   if (d >= a && d >= b && d >= c)
            System.out.println(d);




    }
}
