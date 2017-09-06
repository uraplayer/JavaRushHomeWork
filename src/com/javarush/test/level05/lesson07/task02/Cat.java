package com.javarush.test.level05.lesson07.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью инициализаторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст неизвестны, это бездомный кот)
- вес, цвет, адрес ( чужой домашний кот)
Задача инициализатора – сделать объект валидным. Например, если вес неизвестен, то нужно указать какой-нибудь средний вес. Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{
    private String name = null;
    private int weight = 5;
    private int age = 6;
    private String color;
    private String address = null;

    public void initialize (String name) //Имя
    {
        this.name=name;
    }
    public void initialize(String name, int weight, int age) // Имя, вес, возраст

    {
        this.name=name;
        this.weight=weight;
        this.age=age;
    }

    public void initialize(String name, int age) //Имя, возраст (вес стандартный)
    {
        this.name=name;
        this.age=age;

    }

    public void initialize(int weight, String color) //вес, цвет, (имя, адрес и возраст неизвестны, это бездомный кот
    {

        this.weight=weight;
        this.color=color;

    }

    public void initialize(int weight, String color, String address) //вес, цвет, адрес ( чужой домашний кот)
    {

        this.weight=weight;
        this.color=color;
        this.address=address;

    }




    //напишите тут ваш код

}
