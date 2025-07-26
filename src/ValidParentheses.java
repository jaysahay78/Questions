import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(char c: s.toCharArray()){
            if(c == '(' || c == '{' || c== '['){
                st.push(c);
            }
            else {
                if (st.isEmpty()) return false;

                if(c == ')' && st.peek() == '(' || c == '}' && st.peek() == '{' || c == ']' && st.peek() == '['){
                    st.pop();
                }
                else return false;
            }
        }
        return st.isEmpty();
    }
}
