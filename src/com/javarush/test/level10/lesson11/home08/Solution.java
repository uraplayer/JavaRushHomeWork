package com.javarush.test.level10.lesson11.home08;

import java.util.ArrayList;

/* Массив списков строк
Создать массив, элементами которого будут списки строк. Заполнить массив любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<String>[] arrayOfStringList =  createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList()
    {

        ArrayList<String>[] list = new ArrayList[3];

        list[0] = new ArrayList<>();
        list[0].add("123");
        list[0].add("456");

        list[1] = new ArrayList<>();
        list[1].add("789");
        list[1].add("101112");

        list[2] = new ArrayList<>();
        list[2].add("131415");
        list[2].add("161718");

        //напишите тут ваш код

        return list;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList)
    {
        for (ArrayList<String> list: arrayOfStringList)
        {
            for (String s : list)
            {
                System.out.println(s);
            }
        }
    }
}