package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CoreQueOne {
    public static void main(String[] args) {
        List<String> strList = Arrays.asList("Pragra", "", "Software", "", "Java","Spring","","Shell");
        System.out.println(strList.stream().filter(String::isBlank).count()); //count of empty string
        strList.stream().filter(i-> i.length()>4).forEach(System.out::println); //string length more than 4
        System.out.println(strList.stream().filter(i -> i.startsWith("S")).count()); // string count starts with s
        List<String> collect = strList.stream().filter(i -> !(i.isBlank())).collect(Collectors.toList());//strings except empty/0 length
        System.out.println(collect);
        List<String> collect1 = strList.stream().filter(i -> i.length() > 2).collect(Collectors.toList());
        System.out.println(collect1);
        System.out.println(strList.stream().map(String::toUpperCase).collect(Collectors.joining(",")));
//        System.out.println(collect2);
    }
}

