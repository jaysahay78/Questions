public class LongestPalindromicSubstring {
    static String longestPalindrome(String s){
        if(s.length() == 1){
            return s;
        }
        String ans = "";
        int i = 0;
        for(i = 1; i<s.length(); i++){
            int low = i;
            int high = i;

            while(s.charAt(low) == s.charAt(high)){
                low--;
                high++;

                if(low == -1 || high == s.length()) break;
            }

            String pal = s.substring(low+1, high);
            if(pal.length() > ans.length()){ ans = pal; }

            low = i-1;
            high = i;
            while(s.charAt(low) == s.charAt(high)){
                low--;
                high++;

                if(low == -1 || high == s.length()) break;
            }
            pal = s.substring(low+1, high);
            if(pal.length() > ans.length()){ ans = pal; }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"));
    }
}
