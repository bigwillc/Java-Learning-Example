package com.example.demo.others;

public class FileReader {

    public static void print() {
        System.out.println(FileReader.class.getClass().
                getResourceAsStream("/skus.txt"));
    }

    public static void main(String[] args) {
        print();
    }
}
