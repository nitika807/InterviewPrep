package InterviewQue;

import java.util.Stack;
public class BalancedParenth {
    public static void main(String[] args) {
        System.out.println(checkParenth("{}([}])"));
    }
    public static boolean checkParenth(String st){
        Stack stack = new Stack<>();
        char[] ch = st.toCharArray();
        for(int i=0; i< ch.length;i++){
            char current = ch[i];
            if(current=='('||current=='{'||current=='['){
                stack.push(current);
                continue;
            }
            if(stack.isEmpty()){
                return false;
            }

            char popChar;
            switch (current){
                case ')':
                    popChar = (char)stack.pop();
                    if(popChar=='{'|| popChar=='[')
                        return false;
                    break;
                case '}':
                    popChar = (char)stack.pop();
                    if(popChar=='('|| popChar=='[')
                        return false;
                    break;
                case ']':
                    popChar = (char) stack.pop();
                    if(popChar=='('||popChar=='{')
                        return false;
                    break;
            }
        }
        return stack.isEmpty();
    }
}
