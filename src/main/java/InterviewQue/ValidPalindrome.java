package InterviewQue;

import java.util.stream.IntStream;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";

        String otherWay = s.replaceAll("\\W", "").toLowerCase();
        //this line is performing the same task
        //as the foreach is doing below by checking every character if that is a digit or a letter.

        String temp = "";
        int bPoint = otherWay.length()-1;
        for(int i=bPoint; i>=0;i--){
            temp +=otherWay.charAt(i);
        }
        System.out.println(temp.equalsIgnoreCase(otherWay));
        System.out.println(match(s));//function call to check a string a palindrome
        //following is the stream method to find out palindrome.
        System.out.println(IntStream.range(0, otherWay.length()).allMatch(i -> otherWay.charAt(i) == otherWay.charAt(bPoint - i)));
    }

    public static boolean match(String s) {
        StringBuilder result = new StringBuilder();
        for (Character c : s.toLowerCase().toCharArray()) {
            if (Character.isDigit(c) || Character.isLetter(c)) {
                result.append(c);
            }
        }

        int fPoint = 0, ePoint = result.length() - 1;

        while (fPoint <= ePoint) {
            if (result.charAt(fPoint) != result.charAt(ePoint)) {
                return false;
            }
            fPoint++;
            ePoint--;
        }
        return true;
    }
}
