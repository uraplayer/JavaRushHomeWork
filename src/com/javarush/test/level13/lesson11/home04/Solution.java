package com.javarush.test.level13.lesson11.home04;

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой стороки.
*/

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.*;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileName = br.readLine();
        OutputStream outStream = new FileOutputStream(fileName);
        ArrayList<String> arrayList = new ArrayList<>();


        while (true)
        {
            String line = br.readLine();
            arrayList.add(line +"\r\n");
            if (line.equals("exit"))
            {
                for (String list : arrayList)
                {
                    outStream.write(list.getBytes());
                }

                break;

            }
        }


        outStream.close();
        br.close();

    }
}
