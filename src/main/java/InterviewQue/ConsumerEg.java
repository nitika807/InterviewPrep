package InterviewQue;

import java.util.Arrays;

public class ConsumerEg {
    public static void main(String[] args) {

        int[] eg = {1,2,3,4,5};
        RevArray revArray = (ar, start, end)->{
            while(start<end){
                int temp = ar[start];
                ar[start] = ar[end];
                ar[end] = temp;
                start++;
                end--;
            }
            return Arrays.stream(ar).toArray();
        };
        System.out.println(Arrays.toString(revArray.reverseAr(eg, 0, eg.length-1)));

    }

     interface RevArray {
        int[] reverseAr(int[] eg, int start, int end);
    }
}
