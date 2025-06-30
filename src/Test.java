import java.util.*;

public class Test {
    static void test(String str) {
    }

    public static void main(String[] args) {
        String digits = "23";
        String[] arr = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        String s = arr[digits.charAt(0) - '0'];
        System.out.println(s);
        StringBuilder sb = new StringBuilder();
    }
}
