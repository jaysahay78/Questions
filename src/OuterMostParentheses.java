public class OuterMostParentheses {
    static String removeOuterParentheses(String s) {
        String ans="";
        int i, j=0;
        int count = 0;
        for (i=0; i<s.length(); i++){
            if (s.charAt(i) == '('){
                count++;
            }
            else if(s.charAt(i) == ')'){
                count--;
            }
            if(count==0){
                ans+=s.substring(j+1,i);
                j=i+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "(()())(())";
        System.out.println(removeOuterParentheses(s));
    }

}