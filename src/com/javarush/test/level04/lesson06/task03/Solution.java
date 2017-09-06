package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sX = br.readLine();
        String sY = br.readLine();
        String sZ = br.readLine();
        //String sZ1 = br.readLine();

        int a = Integer.parseInt(sX);
        int b = Integer.parseInt(sY);
        int c = Integer.parseInt(sZ);   //напишите тут ваш код
        //int d = Integer.parseInt(sZ1);   //напишите тут ваш код
        int max1, max2, max3;

        if (a >= b && a >= c)
            if (b >= c) {
                System.out.println(a);
                System.out.println(b);
                System.out.println(c);

            } else {
                System.out.println(a);
                System.out.println(c);
                System.out.println(b);
            }

        else if (b >= a && b >= c)
            if (a >= c) {
                System.out.println(b);
                System.out.println(a);
                System.out.println(c);
            } else {
                System.out.println(b);
                System.out.println(c);
                System.out.println(a);
            }
        else if (c >= a && c >= b)
            if (a >= b) {
                System.out.println(c);
                System.out.println(a);
                System.out.println(b);
            } else {

                System.out.println(c);
                System.out.println(b);
                System.out.println(a);
            }
    }
}


   //напишите тут ваш код



