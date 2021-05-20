package com.example.demo.others;

public class Util {

    public String getFilePath() {
        String fileName = this.getClass().getClassLoader().getResource("data/skus.xls").getPath();
        return fileName;
    }
}
