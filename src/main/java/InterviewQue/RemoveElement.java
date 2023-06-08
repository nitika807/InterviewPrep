package InterviewQue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class RemoveElement {
    public static void main(String[] args) {
        int[] array = new int[]{100,20,45,800,1,45,345,20};
        List<Integer> collect = removeEle(array, 20).stream().sorted().collect(Collectors.toList());
        System.out.println(collect+"-"+collect.size());
        Arrays.stream(array).mapToObj(i-> (i!=20));
    }

    static List<Integer> removeEle(int[] array, int val){
        List<Integer> newArray = new ArrayList<>();
        for (int j : array) {
            if (!(j == val)) {
                newArray.add(j);
            }
        }
        return newArray;
    }

}
