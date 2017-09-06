package com.javarush.test.level04.lesson04.task06;

/* День недели
Ввести с клавиатуры номер дня недели, в зависимости от номера вывести название «понедельник», «вторник», «среда», «четверг», «пятница», «суббота», «воскресенье»,
если введен номер больше или меньше 7 – вывести «такого дня недели не существует».
Пример для номера 5:
пятница
Пример для номера 10:
такого дня недели не существует
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String w = reader.readLine();
        int week = Integer.parseInt(w);

        String weekString;
        switch (week) {

        case 1: weekString = "понедельник";
            break;
        case 2: weekString = "вторник";
            break;
        case 3: weekString = "среда";
            break;
        case 4: weekString = "четверг";
            break;
        case 5: weekString = "пятница";
            break;
        case 6: weekString = "суббота";
            break;
        case 7: weekString = "воскресенье";
            break;
        default: weekString = "такого дня недели не существует";
            break;
    }
        System.out.println(weekString);

    }

}