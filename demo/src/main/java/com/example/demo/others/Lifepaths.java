package com.example.demo.others;

import java.net.URL;

public class Lifepaths {
    public static void execute() {

        URL url = Lifepaths.class.getClass().getResource("/skus.txt");
        System.out.println(url);
//        System.out.println(Lifepaths.class.
//                getResourceAsStream("/skus.txt"));
    }

    private Lifepaths() {}

    //This is temporary; will eventually be called from outside
    public static void main(String[] args) {execute();}
}
