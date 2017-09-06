package com.javarush.test.level09.lesson11.home09;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* Десять котов
Создать класс кот – Cat, с полем «имя» (String).
Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех имен и вывести его на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap()
    {
        Map<String, Cat> map = new HashMap<String, Cat>();
        map.put("F", new Cat("df"));
        map.put("dfb", new Cat("v"));
        map.put("dbf", new Cat("Вc"));
        map.put("uyo", new Cat("cv"));
        map.put("g", new Cat("Вr"));
        map.put("c", new Cat("Вgr"));
        map.put("b", new Cat("Вgdf"));
        map.put("f", new Cat("dfg"));
        map.put("g", new Cat("xcv"));
        map.put("e", new Cat("cb"));
        map.put("ytu", new Cat("yu"));

      return map;  //напишите тут ваш код
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map)
    {
        Set<Cat> set = new HashSet<Cat>();
        for (Map.Entry<String, Cat> pair : map.entrySet())
        {
            Cat value = pair.getValue();                      //ключ
            //String value = pair.getValue();                  //значение

            set.add(value);
           // System.out.println(key);

        }

        return set;  //напишите тут ваш код
    }

    public static void printCatSet(Set<Cat> set)
    {
        for (Cat cat:set)
        {
            System.out.println(cat);
        }
    }

    public static class Cat
    {
        private String name;

        public Cat(String name)
        {
            this.name = name;
        }

        public String toString()
        {
            return "Cat "+this.name;
        }
    }


}
