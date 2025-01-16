package com.stramandlamda;

import java.util.Arrays;
import java.util.List;

public class Q5 {
    public static void main(String[] args) {
        List<String> nameList = Arrays.asList("Ama", "Kalana", "John","Kasun","Sanjaya","Yash");
        List<String> namesStartWithK = nameList.stream().filter( x->x.startsWith("K")).toList();
        System.out.println(namesStartWithK);
    }
}
