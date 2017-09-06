package com.javarush.test.level05.lesson12.home05;
import java.io.BufferedReader;
import java.io.InputStreamReader;
/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//number.equals("сумма")
        int sum = 0;

        while(true) {
            String number = br.readLine();
            if (number.equals("сумма")) break;
            int n = Integer.parseInt(number);
            sum = sum + n;    //напишите тут ваш код
            //System.out.println(sum);
        }
        System.out.println(sum);

    }
}
