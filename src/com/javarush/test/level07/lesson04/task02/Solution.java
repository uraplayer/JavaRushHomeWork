package com.javarush.test.level07.lesson04.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Массив из строчек в обратном порядке
1. Создать массив на 10 строчек.
2. Ввести с клавиатуры 8 строчек и сохранить их в массив.
3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {

     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     String[] array = new String[10];

        for (int i = 0; i < array.length-2; i++)
            array[i] = br.readLine();
          //напишите тут ваш код
        for (int i = 0; i < array.length ; i++)
            System.out.println(array[9-i]);
    }
}