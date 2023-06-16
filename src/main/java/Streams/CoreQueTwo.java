package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CoreQueTwo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(9,5,34,56,2,6, 10, 3, 4,3, 6, 7, 3, 4);
        Set<Integer> collect = numbers.stream().map(i -> i * 2).collect(Collectors.toSet());
        System.out.println(collect);//square of distinct numbers
        System.out.println(numbers.stream().count());// count of numbers
        numbers.stream().min(Comparator.comparing(i -> i)).ifPresent(System.out::println);
        numbers.stream().max(Comparator.comparing(i -> i)).ifPresent(System.out::println);
        System.out.println((Integer) numbers.stream().mapToInt(i -> i).sum());
        System.out.println(numbers.stream().collect(Collectors.averagingInt(i -> i)));

    }
}
