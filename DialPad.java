package com.company;

public class DialPad {
    public static void main(String[] args) {
        dialpad("", "419");
    }

    static void dialpad(String pr, String upr){
        if (upr.isEmpty()){
            System.out.println(pr);
            return;
        }

        int digit = upr.charAt(0) - '0';
        int start = (digit <= 7) ? (digit-2)*3 : (digit-2)*3+1;
        int end = start + ((digit == 7 || digit == 9) ? 4 : 3);
        for (int i = start; i < end; i++) {
            char ch = (char)('a' + i );

            dialpad(pr + ch, upr.substring(1));
        }
    }
}
