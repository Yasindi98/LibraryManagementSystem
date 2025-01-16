package com.stramandlamda;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Q7 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(288,56,34,67,24,89,52,35);
        Optional<Integer> max = list.stream().max(Integer::compareTo);
        System.out.println(max.get());
    }
}
