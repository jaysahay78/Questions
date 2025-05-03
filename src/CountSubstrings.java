public class CountSubstrings {
    static int numberofSubstrings(String s) {
        int n = s.length();
        return (n*(n+1))/2 + 1;
    }
    public static void main(String[] args) {
        System.out.println(numberofSubstrings("abc"));
    }
}
