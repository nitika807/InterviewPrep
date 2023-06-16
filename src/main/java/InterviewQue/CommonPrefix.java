package InterviewQue;

public class CommonPrefix {
    public static void main(String[] args) {
        String[] ar = {"Apple", "Applet","Applause","Aptitude"};
        String prefix = ar[0];
//take the first string of the array as prefix(to check the common starting letters for each element).
// then start comparing the index of the prefix with other element one by one. if the prefix does not match
// i.e. not same, k=remove the letter by 1. after the index is matched, move to the next element.
        for(int i=1; i<ar.length; i++){
            while(ar[i].indexOf(prefix) !=0){
                prefix = prefix.substring(0,prefix.length()-1);
            }
        }
        if(prefix.length() !=0) {
            System.out.println(prefix);
        }else {
            System.out.println("");
        };
    }
}
