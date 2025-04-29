public class Test {
    public static void main(String[] args) {
        int ans = 0;
        String s = "21";
        char ch = s.charAt(0);
        if((ch-'0') % 2 == 0){
            ans = ch-'0';
        }
        System.out.println(ans);
    }
}
