package com.example.demo.others.file;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

public class ReadCustomerFile {
    int idx;
    Connection conn = null;
    PreparedStatement pstmt = null;

          /**
        * 使用commons-io.jar包的FileUtils的类进行读取
        * txt中内容文件的分割必须为|，java中需要加转译符号
        * @Title: readTxtFileByFileUtils
        * @author sunt
        * @date 2017年11月13日
        * @return void
        */

}
