package InterviewQue;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveElement {
    public static void main(String[] args) {
        Integer array[] = new Integer[]{100, 20, 45, 800, 1, 45, 345, 20};
        Arrays.stream(array).filter(i -> i != 20).forEach(System.out::println);


    }
}






//        System.out.println(eg);
//        System.out.println(collect+"-"+collect.size());
//        Arrays.stream(array).mapToObj(i-> (i!=20));
//    }
//
//    static List<Integer> removeEle(int[] array, int val){
//        List<Integer> newArray = new ArrayList<>();
//        for (int j : array) {
//            if (!(j == val)) {
//                newArray.add(j);
//            }
//        }
//        return newArray;
//    }

//}
