package InterviewQue;

import java.util.HashMap;
import java.util.Map;

public class DifferentCharacter {
    public static void main(String[] args) {
        String s = "jklho";
        String p = "jllkloh";
        int sum = 0;
        int start = 0;
        int end = s.length();
        while (start<end){
            sum += p.charAt(start) - s.charAt(start);
            start++;
        }
        sum+= p.charAt(start);
        System.out.println((char)sum);

        System.out.println(differentChar(s, p));
    }

    //another approach for finding out the different character

    private static char differentChar(String s, String p) {

        Map<Character, Integer> result = new HashMap<>();
        for(int i=0; i< s.length(); i++){
            result.put(s.charAt(i), result.getOrDefault(s.charAt(i), 0)+1);
        }
        for(int i=0; i< p.length(); i++){
            char ch = p.charAt(i);
            if(result.containsKey(ch) && result.get(ch)>0){
                result.put(ch, result.get(ch)-1);
            }
            else{
                return ch;
            }
        }
        return ' ';
    }



}
