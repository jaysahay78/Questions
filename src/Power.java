public class Power {
    static double myPow(double x, int n) {
        double ans = 1.0;
        long N = n;
        if(N<0) N = N*-1;
        while(N>0){
            if(N%2 == 1){
                ans = ans*x;
                N--;
            }
            else{
                x = x*x;
                N=N/2;
            }
        }
        if(n<0) ans = (double)1/ (double)ans;
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(myPow(2,-200000000));
    }
}
