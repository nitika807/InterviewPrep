package InterviewQue;

public class stringRev {
    public static void main(String[] args) {
        String str = "hello";
        StringBuilder temp = new StringBuilder();
        int j=str.length()-1;
        while(j>=0){
            temp.append(str.charAt(j));
            j--;
        }
        System.out.println(temp);
    }
}
