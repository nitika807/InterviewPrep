package InterviewQue;

import java.util.Arrays;

public class PalindromeString {
    public static void main(String[] args) {
        String st = "dead";
        System.out.println(palinCheck(st));
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
