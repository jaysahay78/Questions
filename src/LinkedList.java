class Node{
    int data;
    Node next;

    Node(int data, Node next){
        this.data = data;
        this.next = next;
    }

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Node n1 = new Node(arr[0]);
        Node n2 = new Node(arr[1], n1);
        System.out.println(n2.next.data + " " + n2.data);
    }
}
