package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        Human child1 = new Human("Катя", false, 5);
        Human child2 = new Human("Петя", true, 15);
        Human child3 = new Human("Настя", false, 6);

        ArrayList<Human> kids = new ArrayList<Human>();
        kids.add(child1);
        kids.add(child2);
        kids.add(child3);

        Human father = new Human("Мама1", true, 36, kids);
        Human mother = new Human("Папа1", false, 37, kids);

        ArrayList<Human> parents = new ArrayList<Human>();
        parents.add(father);
        parents.add(mother);

        Human grandPa1 = new Human("Дедушка Саша", true, 67, parents);
        Human grandPa2 = new Human("Дедушка Вася", true, 68, parents);
        Human grandMa1 = new Human("Бабушка Лена", false, 64, parents);
        Human grandMa2 = new Human("Бабушка Таня", false, 62, parents);

        ArrayList<Human> family = new ArrayList<Human>();
        family.add(grandPa1);
        family.add(grandPa2);
        family.add(grandMa1);
        family.add(grandMa2);
        family.add(father);
        family.add(mother);
        family.add(child1);
        family.add(child2);
        family.add(child3);

        for (int i = 0; i < family.size(); i++)
        {
           // i = family.size() - i - 1;
            System.out.println( family.get(i) );
        }


    }

    public static class Human
    {
        String name;
        Boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<Human>();

        public Human(String name, Boolean sex, int age, ArrayList<Human> children)
        {

            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        //напишите тут ваш код
        public Human(String name, Boolean sex, int age)
        {

            this.name = name;
            this.sex = sex;
            this.age = age;

        }


        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }

            return text;
        }
    }

}
