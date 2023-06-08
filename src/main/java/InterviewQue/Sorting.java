package InterviewQue;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] arrEg = {6,2,4,5,1,3};
        int[] arrEg2 = {6,2,4,5,1,3};
        int[] arrEg3 = {6,2,4,5,1,3};
        System.out.println("Bubble sort");
        Arrays.stream(BubbleSort(arrEg)).forEach(System.out::println);
        System.out.println("\n");
        System.out.println("Selection sort");
        Arrays.stream(SelectionSort(arrEg2)).forEach(System.out::println);
        System.out.println("\n");
        System.out.println("Insertion sort");
        Arrays.stream(InsertionSort(arrEg3)).forEach(System.out::println);
    }
//bubble sort
    public static int[] BubbleSort(int[] arrEg) {
        for(int i=0; i<arrEg.length-1;i++){
            for(int j=0; j< arrEg.length-1;j++){
                if(arrEg[j]>arrEg[j+1]){
                    int temp = arrEg[j];
                    arrEg[j] = arrEg[j+1];
                    arrEg[j+1] = temp;
                }
            }
        }
        return arrEg;
    }

    //Merge Sort
    public static int[] SelectionSort(int[] arrEg) {
        for(int i=0; i< arrEg.length-1; i++){
            int smallest = i;
            for(int j= i+1; j< arrEg.length;j++){
                if(arrEg[smallest] > arrEg[j]){
                    smallest = j;
                }
            }
            int temp = arrEg[smallest];
            arrEg[smallest] = arrEg[i];
            arrEg[i] = temp;
        }
        return arrEg;
    }

    //Merge Sort
    public static int[] InsertionSort(int[] arrEg) {
        for(int i=1; i<arrEg.length;i++){
            int current = arrEg[i];
            int j = i-1;
            while(j>=0 && current < arrEg[j]){
                    arrEg[j+1]=arrEg[j];
                    j--;
                }
            arrEg[j+1] = current;
        }
        return arrEg;
    }



}
