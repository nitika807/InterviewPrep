package InterviewQue;

import java.util.Arrays;
import java.util.stream.IntStream;

public class PalindromeString {
    public static void main(String[] args) {
        String st = "Race car".toLowerCase().replaceAll("\\W","");
        int endPoint = st.length()-1;
        System.out.println(st);
        System.out.println(palinCheck(st));
        System.out.println(IntStream.range(0, st.length()).allMatch(i -> st.charAt(i) == st.charAt(endPoint - i)));
    }

    public static boolean palinCheck(String st){
        String temp = "";
        for(int i=st.length()-1; i>=0;i--){
            temp += st.charAt(i);
        }
        if(temp.equals(st)){
            return true;
        }

        return false;
    }
}
