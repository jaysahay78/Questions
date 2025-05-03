public class StringtoInteger {
    static int myAtoi(String s) {
        s=s.trim();
        long ans = 0;
        int sign = 1;
        int i=0;
        if (s.isEmpty()) return 0;
        if(s.charAt(0) == '-' || s.charAt(0) == '+') {
            sign = s.charAt(0) == '+' ? 1 : -1;
            i++;
        }
        while(i<s.length() && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';
            ans = (ans*10) + digit;
            if(ans*sign > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if(ans*sign < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            i++;
        }

        return (int) (ans*sign);
    }

    public static void main(String[] args) {
        System.out.println(myAtoi("20000000000000000000"));
    }
}
