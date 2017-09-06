package com.javarush.test.level08.lesson08.task05;

import java.util.HashMap;
import java.util.*;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {

        HashMap<String, String> map = new HashMap<String, String>();

        map.put("Ежова", "Катя");
        map.put("Ежов", "Петр");
        map.put("Петров", "Петр");
        map.put("Шишкин", "Николай");
        map.put("Савута", "Юрий");
        map.put("Сухин", "Игорь");
        map.put("Петрова", "Аня");
        map.put("Багудина", "Елена");
        map.put("Гришин", "Дмитрий");
        map.put("Аперкот", "Увик"); //напишите тут ваш код

        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        HashMap<String, String> map2 = new HashMap<String, String>(map);
        HashMap<String, String> map3 = new HashMap<String, String>(map);

        for (Map.Entry<String, String> pair : map2.entrySet())
        {
            map3.remove(pair.getKey());

            if (map3.containsValue(pair.getValue()))
            {
                removeItemFromMapByValue(map, pair.getValue());
            }
        }
    }



    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

     public static void main(String[] args)
    {
        HashMap<String, String> map = createMap();
        removeTheFirstNameDuplicates(map);
        for (HashMap.Entry<String, String> pair : map.entrySet())
            System.out.println(pair.getKey() + " - " + pair.getValue());

    }
}
