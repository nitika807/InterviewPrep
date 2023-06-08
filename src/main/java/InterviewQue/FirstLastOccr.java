package InterviewQue;

import java.util.Arrays;

public class FirstLastOccr {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 2 , 4, 5,5,5,8,10};
        int target = 5;
        int[] result = new int[2];
        result[0] = firstElement( arr, target);
        result[1] = secondElement( arr, target);
        Arrays.stream(result).forEach(System.out::println);
    }

    static int firstElement(int[] array, int target){
        int start = 0;
        int end = array.length-1;
        int index = -1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(array[mid]>=target){
                end = mid-1;
            } else {
                start = mid+1;
            }
            if(array[mid]==target){
                index=mid;
            }
        }
     return index;
    }

    static int secondElement(int[] array, int target){
        int start = 0;
        int end = array.length-1;
        int index = -1;
        while(start<=end){
            int mid = start + (end -start)/2;
            if(array[mid]<=target){
                start = mid+1;
            } else {
                end = mid-1;
            }
            if(array[mid]==target){
                index=mid;
            }
        }
        return index;
    }
}
//
//
//        int[] arr = new int[]{1,2,3,4,5,5,5};
//        int target = 5;
//        int firstResult = firstLast(arr, target);
//        int secondResult = firstLast(arr, target);
//        int[] result= new int[]{firstResult, secondResult};
//        Arrays.stream(result).forEach(System.out::println);
//    }
//
//    static int firstLast(int[] arr, int target) {
//        int start = 0, end = arr.length - 1;
//        int f_pos = arr.length;
//        while (start <= end) {
//            int mid = start + (end - start) / 2;
//            if (arr[mid] >= target) {
//                f_pos = mid;
//                end = end - 1;
//            } else {
//                start = mid + 1;
//            }
//            if (f_pos == -1 || arr[mid] != target) {
//                f_pos = -1;
//            }
//        }
//        return f_pos;
//    }
//}
