import java.net.http.WebSocket;
import java.util.Scanner;

public class ReversingEncryption {
    static String reverse(String s, int ind){
        StringBuilder sb = new StringBuilder();
        for(int i=ind-1; i>=0; i--){
            sb.append(s.charAt(i));
        }
        sb.append(s.substring(ind));
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        sc.close();
        for(int i=1; i<=s.length(); i++){
            if(n%i == 0){
                s = reverse(s, i);
            }
        }
        System.out.println(s);
    }
}
