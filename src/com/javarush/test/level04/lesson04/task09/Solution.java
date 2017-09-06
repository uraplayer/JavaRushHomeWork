package com.javarush.test.level04.lesson04.task09;

/* Светофор
Работа светофора для пешеходов запрограммирована следующим образом: в начале каждого часа в течение трех минут горит зеленый сигнал,
затем в течение одной минуты — желтый, а потом в течение одной минуты — красный, затем опять зеленый горит три минуты и т. д.
Ввести с клавиатуры вещественное число t, означающее время в минутах, прошедшее с начала очередного часа.
Определить, сигнал какого цвета горит для пешеходов в этот момент.
Результат вывести на экран в следующем виде:
"зеленый" - если горит зеленый цвет, "желтый" - если горит желтый цвет, "красный" - если горит красный цвет.
Пример для числа 2.5:
зеленый
Пример для числа 3:
желтый
Пример для числа 4:
красный
Пример для числа 5:
зеленый
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sX = br.readLine();
        double a = Double.parseDouble(sX);

        if (a < 60) {
            while (a - 5 > 0) {

                a = a - 5;
                // System.out.println(a);
            }
            if (a > 0 && a < 3)
                System.out.println("зеленый");
            else if (a >= 3 && a < 4)
                System.out.println("желтый");
            else if (a >= 4 && a < 5)
                System.out.println("красный");
            else
                System.out.println("зеленый");
        }//напишите тут ваш код

    }
}