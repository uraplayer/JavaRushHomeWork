package com.javarush.test.level09.lesson11.home05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* Гласные и согласные буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа должна вывести на экран две строки:
1. первая строка содержит только гласные буквы
2. вторая - только согласные буквы и знаки препинания из введённой строки.
Буквы соединять пробелом, каждая строка должна заканчиваться пробелом.

Пример ввода:
Мама мыла раму.
Пример вывода:
а а ы а а у
М м м л р м .
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
      splitVowels();
    }


    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    //метод проверяет, гласная ли буква
    public static boolean isVowel(char c)
    {
        c = Character.toLowerCase(c);  //приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   //ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }

    public static void splitVowels() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  //напишите тут ваш код
        String s = br.readLine();

        char [] charArray = s.toCharArray();
        ArrayList<Character> vowelsList = new ArrayList<Character>();
        ArrayList<Character> consonantList = new ArrayList<Character>();
       // char [] vowelsArray;
        char [] consonantArray;
        for (int i = 0; i < charArray.length ; i++)
        {
            if (isVowel(charArray[i]))
            vowelsList.add(charArray[i]);
            else consonantList.add(charArray[i]);
        }

        for (int i = 0; i < vowelsList.size(); i++)
        {
            System.out.print(vowelsList.get(i) + " ");
        }
        System.out.println();
        for (int i = 0; i < consonantList.size(); i++)
        {
            System.out.print(consonantList.get(i) + " ");
        }

}



}
