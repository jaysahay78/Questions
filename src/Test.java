public class Test {

    public static int countSubstrings(String s) {
        int n = s.length();
        int count = 0;

        for (int center = 0; center < 2*n-1; center++) {
            int l = center/2;
            int r = l + center%2;

            while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
                count++;
                l--;
                r++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countSubstrings("aaa"));
        System.out.println(1+1%2);
    }
}
