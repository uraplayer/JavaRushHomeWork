package com.javarush.test.level08.lesson11.home05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Мама Мыла Раму. Теперь с большой буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
  мама     мыла раму.

Пример вывода:
  Мама     Мыла Раму.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        if (!s.isEmpty())
        {
            char ss[] = s.toCharArray();
            ss[0] = Character.toUpperCase(ss[0]);
            for (int i = 1; i < ss.length; i++)
            {
                if ((Character.isLetter(ss[i]) && ss[i - 1] == ' ') || (Character.isLetter(ss[i]) && Character.isDigit(ss[i - 1])))
                {
                    ss[i] = Character.toUpperCase(ss[i]);
                }
            }
            String result = new String(ss);
            System.out.println(result);
        } else
            System.out.println(s);
    }
}
