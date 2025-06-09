public class GoodNumbers {
    static int countGoodNumbers(long n) {
        int m = 1000000007;
        return (int) ((myPow(5, (n+1)/2) * (int) myPow(4, n/2) ) % m);
    }
    static long myPow(long base, long power){
        long ans = 1;
        int mod = 1000000007;
        while(power>0){
            if(power%2 == 1){
                ans = (ans*base) % mod;
                power--;
            }
            else{
                base = (base*base) % mod;
                power=power/2;
            }
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
