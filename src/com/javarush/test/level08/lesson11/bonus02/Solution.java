package com.javarush.test.level08.lesson11.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Нужно добавить в программу новую функциональность
Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
Новая задача: Программа должна работать не с номерами домов, а с городами:
Пример ввода:
Москва
Ивановы
Киев
Петровы
Лондон
Абрамовичи

Лондон

Пример вывода:
Абрамовичи
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //list of addresses
        List<String> families = new ArrayList<String>();
        List<String> cities = new ArrayList<String>();

        while (true)
        {
            String family = reader.readLine();

            if (family.isEmpty())
                break;
            else

            {
                String city = reader.readLine();
                families.add(family);
                cities.add(city);
            }
        }
        //System.out.println("Введите семью");
        String family1 = reader.readLine();

        int cityFamily = families.indexOf(family1);
        //System.out.println(cityFamily);
        System.out.println(cities.get(cityFamily));


    }
}
