package com.javarush.test.level05.lesson09.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя конструкторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    private String name;
    private int height;
    private String color;

    public Dog(String name) {

        this.name = name;
    }//напишите тут ваш код

    public Dog(String name, int height) {

        this.name = name;
        this.height=height;
    }

    public Dog(String name, int height, String color) {

        this.name = name;
        this.height=height;
        this.color=color;
    }//напишите тут ваш код  //напишите тут ваш код

}
