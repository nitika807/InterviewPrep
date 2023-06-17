package InterviewQue;

import java.util.HashMap;
import java.util.Map;

public class UniqueCharacter {
    public static void main(String[] args) {
        String s = "llgsdfseetcode";
        System.out.println(UniqChar(s));
    }
    public static int UniqChar(String s){
        Map<Character, Integer> result = new HashMap<>();
//        char[] temp = s.toCharArray();
        int res=Integer.MAX_VALUE;
        for(int i=0; i<s.length();i++) {
            if (!result.containsKey(s.charAt(i))){
                result.put(s.charAt(i), i);
            }
            else{
                result.put(s.charAt(i), -1);
            }
            }
        for(char c: result.keySet()){
            if(!(result.get(c).equals(-1)) && result.get(c)<res){
                res = result.get(c);
            }
        }
        return res;
    }
}
