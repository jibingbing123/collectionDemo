package com.collection.enumDemo;

/**
 * Created by jibingbing on 2018/1/7.
 */
public class GenderTest {
    enum Gender {FEMALE,MALE}

    public static void main(String[] args) {
        for(Gender g : Gender.values()){
            System.out.println(g.ordinal() + ": " + g.name());
        }

        Gender g = Gender.FEMALE;
        switch (g){
            case FEMALE:
                System.out.println("女性");
                break;
            case MALE:
                System.out.println("男性");
                break;
            default:
                System.out.println("未知的性别");
        }
    }
}
