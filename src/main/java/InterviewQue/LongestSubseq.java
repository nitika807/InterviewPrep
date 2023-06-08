package InterviewQue;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class LongestSubseq {
    public static void main(String[] args) {
        int[] array = new int[]{100,200,1,78,4,101,3,2,105,10,102,104};
        System.out.println(LongestSubArray(array));
    }

    static int LongestSubArray(int[] array){
        Set<Integer> arrayInt = new HashSet<>();

        for(int n: array){
            arrayInt.add(n);
        }
        int maxSeq = 0;
        for(int i=0; i<array.length; i++){
            int currNum = array[i];
            int currentSeq = 1;
            if(!arrayInt.contains(currNum-1)){// checking previous number,if does not exist, means that number is the start
                //of a new sequence. This is to remove the problem of looping everytime if there exists a loop. i.e. 1,2,3,4.
                while(arrayInt.contains(currNum+1)){// after checking for previous number, we check if the next consecutive
                    //number is available of the numebr at [i] position. If it does, we update the number by 1 and increase the
                    //sequence length by 1.
                    currNum +=1;
                    currentSeq+=1;
                }
                maxSeq = Math.max(currentSeq,maxSeq);
            }
        }
        return maxSeq;
    }
}
