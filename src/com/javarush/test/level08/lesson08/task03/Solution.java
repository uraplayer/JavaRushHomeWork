package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        Map<String, String> map = new HashMap<String, String>(); //напишите тут ваш код
        map.put("Ежова", "Катя");
        map.put("Ежов", "Петр");
        map.put("Петров", "Иван");
        map.put("Шишкин", "Николай");
        map.put("Савута", "Юрий");
        map.put("Сухин", "Игорь");
        map.put("Петрова", "Аня");
        map.put("Багудина", "Елена");
        map.put("Гришин", "Дмитрий");
        map.put("Аперкот", "Увик");

        return (HashMap<String, String>) map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        int nameCount = 0;
        for (String a : map.values())
        {
            if (a.equals(name))
                nameCount++; //напишите тут ваш код
        }
        return nameCount;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        int lastNameCount = 0;
        for (String b : map.keySet())
        {
            if (b.equals(lastName))
                lastNameCount++;//напишите тут ваш код

        }
        return lastNameCount;
    }

   /* public static void main(String[] args)
    {


        createMap();
        getCountTheSameFirstName(createMap(),"Юрий");
        getCountTheSameLastName(createMap(),"Петров");

        System.out.println(getCountTheSameFirstName(createMap(),"Юрий") + " - " + getCountTheSameLastName(createMap(),"Петров"));
    }*/
}


