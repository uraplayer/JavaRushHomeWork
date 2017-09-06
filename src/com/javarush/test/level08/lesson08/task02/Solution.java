package com.javarush.test.level08.lesson08.task02;

import java.util.*;
import java.util.Set;

/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/

public class Solution {

    public static void main(String[] args)
    {
        createSet();
        System.out.println(removeAllNumbersMoreThan10(createSet()));
    }





    public static HashSet<Integer> createSet()
    {
      HashSet<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < 20; i++)
        {
            set.add(i);

        }

        //напишите тут ваш код
        return set;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set)
    {
        Iterator<Integer> iterator = set.iterator();

        while (iterator.hasNext())        //проверка, есть ли ещё элементы
        {
            //получение текущего элемента и переход на следующий
            Integer n = iterator.next();

            if (n > 10)
                iterator.remove();

        }
            return set;
    }
}
