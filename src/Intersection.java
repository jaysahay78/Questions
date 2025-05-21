public class Intersection {
    static ListNode getIntersection(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;
        ListNode tempA = headA;
        ListNode tempB = headB;
        while(tempA != tempB){
            tempA = (tempA != null) ? tempA.next : headB;
            tempB = (tempB != null) ? tempB.next : headA;
        }
        return tempA;
    }

    public static void main(String[] args) {

    }
}
