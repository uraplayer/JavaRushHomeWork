package com.javarush.test.level04.lesson10.task03;

import java.io.*;

/* Хорошего не бывает много
Ввести с клавиатуры строку и число N.
Вывести на экран строку N раз используя цикл while.
Пример ввода:
абв
2
Пример вывода:
абв
абв
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String number = br.readLine();//напишите тут ваш код
        int n = Integer.parseInt(number);
       while (n !=0 ) {
           n--;
           System.out.println(line);

           //напишите тут ваш код
       }
    }
}
