package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {

        int age;
        int weight;
        String color;
        boolean skin;
        int tall;
        String hair;


        Human(int age)
        {
            this.age = age;

        }

        Human(int weight, int age)
        {
            this.weight = weight;
            this.age = age;
        }

        Human(int weight, int age, String color)
        {
            this.weight = weight;
            this.age = age;
            this.color = color;
        }

        Human(int weight, int age, String color, boolean skin)
        {
            this.weight = weight;
            this.age = age;
            this.color = color;
            this.skin = skin;
        }

        Human(int weight, int age, String color, boolean skin, int tall)
        {
            this.weight = weight;
            this.age = age;
            this.color = color;
            this.skin = skin;
            this.tall = tall;
        }

        Human(int weight, int age, String color, boolean skin, int tall, String hair)
        {
            this.weight = weight;
            this.age = age;
            this.color = color;
            this.skin = skin;
            this.tall = tall;
            this.hair = hair;
        }
        Human(int age, String color, boolean skin, int tall, String hair)
        {
            this.weight = weight;
            this.age = age;
            this.color = color;
            this.skin = skin;
            this.tall = tall;
            this.hair = hair;
        }
        Human(String color, boolean skin, int tall, String hair)
        {
            this.weight = weight;
            this.age = age;
            this.color = color;
            this.skin = skin;
            this.tall = tall;
            this.hair = hair;
        }
        Human(boolean skin, int tall, String hair)
        {
            this.weight = weight;
            this.age = age;
            this.color = color;
            this.skin = skin;
            this.tall = tall;
            this.hair = hair;
        }
        Human(int tall, String hair)
        {
            this.weight = weight;
            this.age = age;
            this.color = color;
            this.skin = skin;
            this.tall = tall;
            this.hair = hair;
        }
    }
}
