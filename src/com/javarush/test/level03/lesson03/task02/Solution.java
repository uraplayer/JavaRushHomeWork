package com.javarush.test.level03.lesson03.task02;

/* Конвертер валют
Реализуйте метод convertEurToUsd, переводящий евро в доллары по заданному курсу.
Вызовите его дважды в методе main с любыми параметрами. Результаты выведите на экран, каждый раз с новой строки.
Подсказка:
Расчет выполняется по формуле: долларСША = евро * курс
*/
public class Solution
{
    public static void main(String[] args) {
        System.out.println(convertEurToUsd(100, 1.51));
        System.out.println(convertEurToUsd(45, 1.11));//напишите тут ваш код
    }

    public static double convertEurToUsd(int eur, double course){
     double resultUSD = eur * course;
        return resultUSD;//напишите тут ваш код
    }
}
