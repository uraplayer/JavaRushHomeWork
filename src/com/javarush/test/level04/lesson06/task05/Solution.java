package com.javarush.test.level04.lesson06.task05;

/* 18+
Ввести с клавиатуры имя и возраст. Если возраст меньше 18 вывести надпись «Подрасти еще».
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();   //напишите тут ваш код
        String age = br.readLine();
        int ageN = Integer.parseInt(age);

        if (ageN < 18)
            System.out.println("Подрасти еще");
    }
}
