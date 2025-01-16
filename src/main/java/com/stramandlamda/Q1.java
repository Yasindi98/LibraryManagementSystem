package com.stramandlamda;

import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        //List<String> nameList = new ArrayList<>();
        //nameList.add("ABC");
        //nameList.add("XYZ");
        //nameList.add("LMN");
        //System.out.println(nameList);

        List<String> nameList = Arrays.asList("ABC","XYZ","LMN");
        System.out.println("Before Reverse : "+nameList);

        Collections.reverse(nameList);
        System.out.println("After Reverse : "+nameList);
    }
}
