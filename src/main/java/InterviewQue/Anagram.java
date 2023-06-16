package InterviewQue;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Anagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
       char[] sChar = s.toCharArray();
       char[] tChar = t.toCharArray();
        Arrays.sort(sChar);
        Arrays.sort(tChar);

        System.out.println(Arrays.equals(sChar,tChar));

        System.out.println(Stream.of(s.toLowerCase().split("")).sorted().collect(Collectors.joining())
                .equals(Stream.of(t.toLowerCase().split("")).sorted().collect(Collectors.joining())));

    }
}
