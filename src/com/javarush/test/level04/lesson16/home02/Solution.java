package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());   //напишите тут ваш код
        int b = Integer.parseInt(reader.readLine());   //напишите тут ваш код
        int c = Integer.parseInt(reader.readLine()); //напишите тут ваш код
        //int mid = 0;
        if (a > b && a < c || a > c && a < b) {
            System.out.println(a);
        } else if (b > c && b < a || b > c && b < a) {
            System.out.println(b);
        } else System.out.println(c);

    }


}
