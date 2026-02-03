import java.util.Arrays;

public class PalindromicSubstring {
    public int countSubstrings(String s) {
        int n = s.length();
        Boolean[][] dp = new Boolean[n][n];
        for(Boolean[] a : dp){
            Arrays.fill(a,null);
        }
        int count = 0;
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                if(isPal(s, dp, i,j)){
                    count++;
                }
            }
        }
        return count;
    }

    public Boolean isPal(String s, Boolean[][] dp, int i, int j){
        if(dp[i][j] != null) return dp[i][j];

        if(s.charAt(i) != s.charAt(j)) return dp[i][j] = false;

        if(j-i<2) return dp[i][j] = true;

        return dp[i][j] = isPal(s, dp, i+1, j-1);
    }
}
