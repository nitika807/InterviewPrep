package InterviewQue;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class RevArray {
    public static void main(String[] args) {
//        ()->             System.out.println("hello");


        int[] ar = {1,2,3,4,5,6,7,8};


        List<Integer> arEg = new ArrayList<>();
                for(int i=0; i< ar.length;i++){
            arEg.add(ar[i]);
        }
        System.out.println(arEg.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));

        Supplier<int[]> eg = ()-> { // this way, there is no need of providing ay separate method.
            int start = 0, end = ar.length-1;
            while(start<end) {
                int temp = ar[start];
                ar[start] = ar[end];
                ar[end] = temp;
                start++;
                end--;
            }
            return ar;
        };
        System.out.println(Arrays.toString(eg.get()));


//        ReverseArray list =(array,start,end)->{ // reversing array
//            while(start<end) {
//                int temp = array[start];
//                array[start] = array[end];
//                array[end] = temp;
//                start++;
//                end--;
//            }
//            return Arrays.stream(array).toArray();
//        };
////        Arrays.stream(list.reverseArray((new int[]{10, 9, 8, 7}), 0, 3)).forEach(System.out::println);
//
//        System.out.println(Arrays.toString(list.reverseArray(new int[]{10, 30, 50, 20, 1}, 0, 4)));

        ReverseString stringRev = (str)->{ // two ways of reversing the string
        String temp = "";
       for(int i= str.length()-1; i>=0;i-- ){
           temp +=str.charAt(i);
//         temp = temp.concat(String.valueOf(str.charAt(i)));
        }
        return temp;
    };
        System.out.println(stringRev.reverseString("my pleasure"));
    }
}
@FunctionalInterface
interface ReverseArray {
    int[] reverseArray(int[] arr, int start, int end);
}
@FunctionalInterface
interface ReverseString {
    String reverseString(String arr);
}