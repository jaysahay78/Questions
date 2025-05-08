import java.util.Arrays;
public class Test {
    public static void main(String[] args) {
        Node n4 = new Node(4);
        Node n3 = new Node(3, n4);
        Node n2 = new Node(2, n3);
        Node n1 = new Node(1,n2);
        n2=n3;

        System.out.println(n1.next.data);
    }
}
