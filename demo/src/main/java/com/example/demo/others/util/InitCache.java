package com.example.demo.others.util;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class InitCache {

    private static Map<String,Object> cacheMap = new ConcurrentHashMap<String,Object>();

    //单实例构造方法
    private InitCache() {
    }

    /**
     * 增加缓存
     * @param key
     * @param value
     */
    public static void setValue(String key,Object value){
        cacheMap.put(key, value);
    }


    //清除指定的缓存
    public synchronized static void clearOnly(String key) {
        cacheMap.remove(key);
    }


    //清除所有缓存
    public synchronized static void clearAll() {
        cacheMap.clear();
    }

    //修改缓存数据
    public synchronized static void editeCache(String key,Object value) {
        clearOnly(key);
        cacheMap.put(key, value);
    }

    /**
     * 以下都是查询
     * @param key
     * @return
     */
    @SuppressWarnings("unchecked")
    public static Map<String,String> getMapValue(String key){
        Object obj =  cacheMap.get(key);
        if(obj!=null){
            return (Map<String, String>) obj;
        }
        return null;
    }

    public static Object getObjValue(String key){
        Object obj =  cacheMap.get(key);
        return obj;

    }


    public static Integer getIntValue(String key){
        Object obj =  cacheMap.get(key);
        if(obj!=null){
            return (Integer)obj;
        }
        return 0;
    }

    public static String getStringValue(String key){
        Object obj =  cacheMap.get(key);
        if(obj!=null){
            return (String)obj;
        }
        return "";
    }

    public static void readTxt() throws FileNotFoundException {
        //InputStream in =  InitCache.class.getResourceAsStream("/resources/data/skus.txt");  //文本目录  YzcPattern 可以换成任意类
        InputStream in =  InitCache.class.getResourceAsStream("skus.txt");  //文本目录  YzcPattern 可以换成任意类
        FileInputStream inputStream = new FileInputStream("d://skus.txt");
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
//                String[] lines = line.split("\\|");
//                if(lines[0].equals("p")){
//                    Map<String,Object> map = new HashMap<String,Object>();
//                    map.put("bh", lines[1]);
//                    map.put("name", lines[2]);
//                    map.put("img", lines[3]);
//                    map.put("listmap", new ArrayList<Map<String,Object>>());
//                    menup.add(map);
//                }else if(lines[0].equals("c")){
//                    Map<String,Object> map = new HashMap<String,Object>();
//                    map.put("pbh", lines[1]);
//                    map.put("bh", lines[2]);
//                    map.put("name", lines[3]);
//                    map.put("dis", lines[4]);
//                    map.put("url", lines[5]);
//                    map.put("img", lines[6]);
//                    menuc.add(map);
//                }
                System.out.println(line);
                line = br.readLine();
            }
//            for(int i=0;i<menup.size();i++){
//                Map<String,Object> ob = menup.get(i);
//                String bm = ob.get("bh")+"";
//                for(int b = 0;b<menuc.size();b++){
//                    Map<String,Object> obc = menuc.get(b);
//                    String pbm = obc.get("pbh")+"";
//                    if(bm.equals(pbm)){
//                        ((ArrayList)ob.get("listmap")).add(obc);
//                    }
//                }
//            }
//            InitCache.setValue("p", menup);
//            InitCache.setValue("c", menuc);

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
