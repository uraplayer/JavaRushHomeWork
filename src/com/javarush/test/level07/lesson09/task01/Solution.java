package com.javarush.test.level07.lesson09.task01;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Три массива
1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2. Метод printList должен выводить на экран все элементы списка с новой строки.
3. Используя метод printList выведи эти три списка на экран. Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
*/

public class Solution
{
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<Integer>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 20; i++) {

            String s = br.readLine();
            list.add(Integer.parseInt(s));//напишите тут ваш код
        }
        ArrayList<Integer> divide3 = new ArrayList<Integer>();
        ArrayList<Integer> divide2 = new ArrayList<Integer>();
        ArrayList<Integer> divideOther = new ArrayList<Integer>();

        for (int i = 0; i <list.size() ; i++) {

                if (list.get(i)%3 == 0  && list.get(i)%2 == 0) {
                    divide3.add(list.get(i));
                    divide2.add(list.get(i));
                } else
                    if (list.get(i) % 3 == 0) {
                        divide3.add(list.get(i));

                } else if (list.get(i)%2 ==0) {
                    divide2.add(list.get(i));
                } else

                    divideOther.add(list.get(i));

        }

        printList(divide3);
        //System.out.println();
        printList(divide2);
        //System.out.println();
        printList(divideOther);
    }

    public static void printList(List<Integer> list)
    {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }   //напишите тут ваш код
    }
}
