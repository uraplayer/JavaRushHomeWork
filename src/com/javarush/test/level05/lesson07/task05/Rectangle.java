package com.javarush.test.level05.lesson07.task05;

/* Создать класс прямоугольник (Rectangle)
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (левая координата, верхняя, ширина и высота). Создать для него как можно больше методов initialize(…)
Примеры:
-	заданы 4 параметра: left, top, width, height
-	ширина/высота не задана (оба равны 0)
-	высота не задана (равно ширине) создаём квадрат
-	создаём копию другого прямоугольника (он и передаётся в параметрах)
*/

public class Rectangle
{
  private int top;
    private int left;
    private int width = 0;
    private int height = 0;

    public void initialize(int top, int left, int width, int height) { //заданы 4 параметра: left, top, width, height
        this.top=top;
        this.left=left;
        this.width=width;
        this.height=height;

    }//напишите тут ваш код

    public void initialize(int top, int left) { //ширина/высота не задана (оба равны 0)
        this.top=top;
        this.left=left;


    }
    public void initialize(int top, int left, int width) { //высота не задана (равно ширине) создаём квадрат
        this.top=top;
        this.left=left;
        this.width=width;
        this.height=width;
    }

    public void initialize(Rectangle anotherRectangle) { //создаём копию другого прямоугольника (он и передаётся в параметрах)
        this.top=anotherRectangle.top;
        this.left=anotherRectangle.left;
        this.width=anotherRectangle.width;
        this.height=anotherRectangle.height;



    }

}
