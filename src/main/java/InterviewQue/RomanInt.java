package InterviewQue;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanInt {
    public static void main(String[] args) {

        Map<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X',10);
        roman.put('L',50);
        roman.put('C',100);
        roman.put('D',500);
        roman.put('M',1000);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Roman literal: ");
        String input = sc.nextLine();
        input = input.replace("IV","IIII");
        input =  input.replace("IX","VIIII");
        input =  input.replace("XL","XXXX");
        input =   input.replace("XC","LXXXX");
        input = input.replace("CD", "CCCC");
        input = input.replace("CM","DCCCC");
        int result = 0;
        for(int i=0; i < input.length();i++){
            result = result + (roman.get(input.charAt(i)));
            System.out.println(result);
        }
        System.out.println(result);


    }
}
