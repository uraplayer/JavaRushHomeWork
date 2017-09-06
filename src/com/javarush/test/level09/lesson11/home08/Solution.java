package com.javarush.test.level09.lesson11.home08;

import java.util.ArrayList;

/* Список из массивов чисел
Создать список, элементами которого будут массивы чисел. Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно. Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList()
    {
        int[] list5 = {1,2,3,4,5};
        int[] list2 = {9,3};
        int[] list4 = {345,6,4,2};
        int[] list7 = {45,23,78,25,13,89,687};
        int[] list0 = {};

      ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(list5);
        list.add(list2);
        list.add(list4);
        list.add(list7);
        list.add(list0);


     return list;   //напишите тут ваш код
    }

    public static void printList(ArrayList<int[]> list)
    {
        for (int[] array: list )
        {
            for (int x: array)
            {
                System.out.println(x);
            }
        }
    }
}
