package InterviewQue;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateChar {
    public static void main(String[] args) {
        String string = "aattitudeaa";
        for(Map.Entry<Character,Integer> ent: duplicChar(string)) {//this will take the entryset returned by method
            //and prints the value if the character occurs more than once
            if (ent.getValue() > 1) {
                System.out.println(ent.getKey() + ":" + ent.getValue());
            }
        }
        System.out.println(duplicChar(string));// prints the occurence of each character in the string
    }

    public static Set<Map.Entry<Character, Integer>> duplicChar(String st) {
        Map<Character, Integer> result = new HashMap<Character, Integer>();
        for (Character ch : st.toCharArray()) {
            if (result.containsKey(ch)) {
                result.put(ch, result.get(ch) + 1);
            } else {
                result.put(ch, 1);
            }
        }
        return result.entrySet();
    }
}
