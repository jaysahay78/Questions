public class StringtoInteger {
    static int myAtoi(String s) {
//        s=s.trim();
//        long ans = 0;
//        int sign = 1;
//        int i=0;
//        if (s.isEmpty()) return 0;
//        if(s.charAt(0) == '-' || s.charAt(0) == '+') {
//            sign = s.charAt(0) == '+' ? 1 : -1;
//            i++;
//        }
//        while(i<s.length() && Character.isDigit(s.charAt(i))) {
//            int digit = s.charAt(i) - '0';
//            ans = (ans*10) + digit;
//            if(ans*sign > Integer.MAX_VALUE) return Integer.MAX_VALUE;
//            if(ans*sign < Integer.MIN_VALUE) return Integer.MIN_VALUE;
//            i++;
//        }
//
//        return (int) (ans*sign);
//    }
        s=s.trim();
        if (s.isEmpty()) return 0;
        int sign = 1;
        if(s.charAt(0) == '+') {
            sign = 1;
            s = s.substring(1);
        }
        else if(s.charAt(0) == '-') {
            sign = -1;
            s = s.substring(1);
        }
        return func(s,0, sign);
    }

    static int func(String s, int num, int sign){
        if(s.length() == 0 || !Character.isDigit(s.charAt(0))) return num*sign;
        int digit = s.charAt(0) - '0';
        if (sign == 1 && num > (Integer.MAX_VALUE - digit) / 10) return Integer.MAX_VALUE;
        if (sign == -1 && -num < (Integer.MIN_VALUE + digit) / 10) return Integer.MIN_VALUE;
        return func(s.substring(1), num*10 + digit, sign);
    }

    public static void main(String[] args) {
        System.out.println(myAtoi("20000000000000000000"));
    }
}
