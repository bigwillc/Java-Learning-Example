package com.example.demo.others;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {



        //BufferedReader是可以按行读取文件
        //FileInputStream inputStream = new FileInputStream("data://a.txt");
        FileInputStream inputStream = new FileInputStream("d://skus.txt");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "gbk"));

        String str = null;
        while((str = bufferedReader.readLine()) != null)
        {
            String[] title = str.split("\\|");
            for (int i = 0; i < title.length; i++) {
                if ("id".equals(title[0])) {
                    System.out.println("哈哈哈");
                }
            }
            System.out.println(str);
        }

        //close
        inputStream.close();
        bufferedReader.close();
    }

}
