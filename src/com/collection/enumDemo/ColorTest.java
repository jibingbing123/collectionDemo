package com.collection.enumDemo;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by jibingbing on 2018/1/7.
 */
public class ColorTest {
    enum Color{RED,BLUE,YELLOW,GREEN}

    public static void main(String[] args) {
        //EnumSet的allOf()静态方法可以将枚举类的所有常量实例存放在Set集合里
        EnumSet<Color> colorSet = EnumSet.allOf(Color.class);
        for(Color c : colorSet){
            System.out.println(c);
        }

        EnumMap<Color,String> colorMap = new EnumMap<Color, String>(Color.class);
        colorMap.put(Color.RED,"红色");
        colorMap.put(Color.BLUE,"蓝色");
        colorMap.put(Color.YELLOW,"黄色");
        colorMap.put(Color.GREEN,"绿色");

        Set<Map.Entry<Color,String>> set = colorMap.entrySet();
        for(Map.Entry entry : set){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
