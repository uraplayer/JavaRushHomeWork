package com.javarush.test.level07.lesson09.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* Слова в обратном порядке
Введи с клавиатуры 5 слов в список строк. Удали 3 - ий элемент списка, и выведи оставшиеся элементы в обратном порядке.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {

        ArrayList<String> list = new ArrayList<String>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        list.add(br.readLine());
        list.add(br.readLine());
        list.add(br.readLine());
        list.add(br.readLine());
        list.add(br.readLine());

        list.remove(2);

        for (int i = 0; i < list.size() ; i++) {
            System.out.println(list.get(list.size() - i -1));
        }
        //напишите тут ваш код

    }
}
