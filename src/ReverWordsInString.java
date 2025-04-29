public class ReverWordsInString {
    static String ReverseWords(String s) {
        String ans="";
        String temp="";
        int i=0;
        int j=s.length()-1;

        while(i<=j){
            char ch=s.charAt(i);
            if(ch!=' '){
                temp+=ch;
            }
            else if(ch ==' ') {
                if (!temp.equals("")) {
                    if (!ans.equals("")) {
                        ans = temp + " " + ans;
                    } else {
                        ans = temp;
                    }
                    temp = "";
                }
            }
            i++;
        }
        if(!temp.equals("")){
            if(!ans.equals("")){
                ans = temp + " " + ans;
            }
            else{ans = temp;}
        }
        return ans;
    }
    public static void main(String[] args) {
        String s = " hello world ";
        System.out.println(ReverseWords(s));
    }
}
