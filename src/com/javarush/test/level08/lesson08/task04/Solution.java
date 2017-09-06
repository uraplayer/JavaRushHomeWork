    package com.javarush.test.level08.lesson08.task04;

import java.util.*;
import java.util.HashMap;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Atallone", new Date("JANUARY 1 1980"));
        map.put("Btallone", new Date("FEBRUARY 1 1980"));
        map.put("Ctallone", new Date("MARCH 1 1980"));
        map.put("Dtallone", new Date("APRIL 1 1980"));
        map.put("Etallone", new Date("MAY 1 1980"));
        map.put("Ftallone", new Date("JULY 1 1980"));
        map.put("Gtallone", new Date("AUGUST 1 1980"));
        map.put("Htallone", new Date("SEPTEMBER 1 1980"));
        map.put("Itallone", new Date("OCTOBER 1 1980"));

        return map; //напишите тут ваш код

    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        //напишите тут ваш код
        Iterator<Map.Entry<String, Date>> iter = map.entrySet().iterator();
        while (iter.hasNext()) {
            Date mon = iter.next().getValue();
            if (mon.getMonth() > 4 && mon.getMonth() < 8)
                iter.remove();
        }

    }

    /*public static void main(String[] args)
    {
        HashMap<String, Date> map = createMap();
        removeAllSummerPeople(map);
        for (Map.Entry<String, Date> pair : map.entrySet())
            System.out.println(pair.getKey() + ":" + pair.getValue());

    }*/

}
