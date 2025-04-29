import java.util.Arrays;

public class ValidAnagram {
    static boolean validAnagram(String s, String t) {
        char[] schar = s.toCharArray();
        char[] tchar = t.toCharArray();

        Arrays.sort(schar);
        Arrays.sort(tchar);
        return Arrays.equals(schar, tchar);
    }

    public static void main(String[] args) {

    }
}
