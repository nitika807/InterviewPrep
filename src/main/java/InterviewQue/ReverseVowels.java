package InterviewQue;

import java.util.HashSet;
import java.util.Set;

public class ReverseVowels {
    public static void main(String[] args) {
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');
        String s = "coal";
        char[] cArray = s.toCharArray();
        int start = 0;
        int end = s.length()-1;
        while(start<end){
            if (!vowels.contains(cArray[start])){
                start++;
            }
            if(!vowels.contains(cArray[end])){
                end--;
            }
            char temp = cArray[start];
            cArray[start] = cArray[end];
            cArray[end] = temp;

            start++;
            end--;
        }

        System.out.println(String.valueOf(cArray));
    }
}
