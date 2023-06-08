package InterviewQue;

import java.util.ArrayList;
import java.util.List;

public class AllSubsequence {

    static List<String> arrayList =new ArrayList<>();

    public static void main(String[] args) {
        String s = "abc";
        subSeq(s,"");
        System.out.println(arrayList);

    }

    private static void subSeq(String s, String result) {

        if(s.length()==0){
            arrayList.add(result);
            return;

        }

        subSeq(s.substring(1), result+s.charAt(0));
        subSeq(s.substring(1), result);
    }
}
