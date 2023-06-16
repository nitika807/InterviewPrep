package InterviewQue;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public static void main(String[] args) {
        String word = "dog cat dog cat fish dog";
        String pattern = "ababca";
        System.out.println(PatternMatcher(pattern, word));
    }

    public static boolean PatternMatcher(String p, String w){
        String[] wArray = w.split(" ");
        if(wArray.length != p.length()) return false;
        Map<Character, String> result = new HashMap<>();
        for(int i = 0; i< p.length(); i++){
            char current_char = p.charAt(i);
            if(result.containsKey(current_char)){
               if(!(result.get(current_char).equals(wArray[i]))){
                   return false;
               }
            }
            else{
                if(result.containsValue(wArray[i])){
                    return false;
                }
            }
            result.put(current_char, wArray[i]);
        }
        return true;
    }
}
