package InterviewQue;

import java.util.Arrays;
import java.util.function.Consumer;

public class MaxMinVal {// two ways of finding our max and min of an array.
    public static void main(String[] args) {
        Consumer<int[]> eg =  ar -> Arrays.stream(ar).max().stream().forEach(System.out::println);//another way of
        eg.accept(new int[]{10,30,56,20}); //finding max and min value using streams.
        int[] arr = new int[]{110,200,3345,4867,50000};
//        Arrays.stream(arr).max().stream().forEach(System.out::println);
//        Arrays.stream(arr).min().stream().forEach(System.out::println);
        MaxArray arrayEg = (s) -> {
            int i=0, temp=s[i];
        for(i = 0; i< s.length-1; i++){
            if(s[i]<s[i+1]){
                temp=s[i+1];
            }
            else{
                temp=s[i];
            }
        }
        return temp;
        } ;
        System.out.println(arrayEg.maxArray(arr));
//        System.out.println(arrayEg.maxArray(new int[]{100, 20, 3, 4}));
    }
}

@FunctionalInterface
interface MaxArray{
    int maxArray(int[] arr);
}
