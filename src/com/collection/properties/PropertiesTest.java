package com.collection.properties;

import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

/**
 * Properties类是一种特殊的Map类,它继承了HashTable<Object,Object>类
 * Created by jibingbing on 2018/1/7.
 */
public class PropertiesTest {
    public static void print(Properties properties){
        Set<Object> keys = properties.keySet();
        Iterator<Object> it = keys.iterator();
        while(it.hasNext()){
            String key = (String)it.next();
            String value = properties.getProperty(key);
            System.out.println(key + " = " + value);
        }
    }

    public static void main(String[] args) throws IOException{
        Properties properties = new Properties();
        InputStream in = PropertiesTest.class.getResourceAsStream("myapp.properties");
        properties.load(in);
        in.close();
        print(properties);

        properties = System.getProperties();
        print(properties);
    }
}
