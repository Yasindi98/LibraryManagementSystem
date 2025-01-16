package com.stramandlamda;

import java.util.Arrays;
import java.util.List;

public class Q3 {
    public static void main(String[] args) {
        List<String> nameList = Arrays.asList("Ama", "Kalana", "John");
        System.out.println(nameList);
        List<String> newList = nameList.stream().map(String::toUpperCase).toList();
        System.out.println(newList);
    }
}
