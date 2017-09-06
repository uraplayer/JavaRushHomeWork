package com.javarush.test.level14.lesson06.home01;

/**
 * Created by y.ezhov on 29.01.2017.
 */
public class BelarusianHen extends Hen
{
    int getCountOfEggsPerMonth()
    {
        return 8;
    }

    public String getDescription()
    {
        return super.getDescription() + " Моя страна - " + Country.BELARUS + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";

    }
}
