package com.example.demo.others.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TxtReadUtil {


    public static void initCache(){
        InputStream in =  TxtReadUtil.class.getClass().getResourceAsStream("skus.txt");  //文本目录  YzcPattern 可以换成任意类
        InputStreamReader reader = null;
        BufferedReader br = null;
        try {
            reader = new InputStreamReader(
                    in,"gbk");
            br = new BufferedReader(reader); // 建立一个对象，它把文件内容转成计算机能读懂的语言
            String line = "";
            line = br.readLine();
            List<Map<String,Object>> menup = new ArrayList<Map<String,Object>>();
            List<Map<String,Object>> menuc = new ArrayList<Map<String,Object>>();
            while (line != null) {
                String[] lines = line.split("\\|");
                if(lines[0].equals("p")){
                    Map<String,Object> map = new HashMap<String,Object>();
                    map.put("bh", lines[1]);
                    map.put("name", lines[2]);
                    map.put("img", lines[3]);
                    map.put("listmap", new ArrayList<Map<String,Object>>());
                    menup.add(map);
                }else if(lines[0].equals("c")){
                    Map<String,Object> map = new HashMap<String,Object>();
                    map.put("pbh", lines[1]);
                    map.put("bh", lines[2]);
                    map.put("name", lines[3]);
                    map.put("dis", lines[4]);
                    map.put("url", lines[5]);
                    map.put("img", lines[6]);
                    menuc.add(map);
                }
                line = br.readLine();
            }
            for(int i=0;i<menup.size();i++){
                Map<String,Object> ob = menup.get(i);
                String bm = ob.get("bh")+"";
                for(int b = 0;b<menuc.size();b++){
                    Map<String,Object> obc = menuc.get(b);
                    String pbm = obc.get("pbh")+"";
                    if(bm.equals(pbm)){
                        ((ArrayList)ob.get("listmap")).add(obc);
                    }
                }
            }
//            initCache.setValue("p", menup);
//            initCache.setValue("c", menuc);

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally{
            if(br!=null){
                try {
                    br.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            if(reader!=null){
                try {
                    reader.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }
}
