package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Practice {
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>( Arrays.asList(1, 2, 3, 4, 5, 6));
        //num.stream().mapToInt(i-> i).min().stream().forEach(i-> System.out.println(i));
        num.stream().mapToInt(i->i).max().stream().forEach(i-> System.out.println(i));
    }

}
