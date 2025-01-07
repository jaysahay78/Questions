package com.company;

public class LinkedSum {
    public static void main(String[] args) {
                // Create example linked lists
                ListNode l1 = new ListNode(4);
                l1.next = new ListNode(5); // Represents the number 45

                ListNode l2 = new ListNode(7);
                l2.next = new ListNode(4); // Represents the number 74

                // Call LinkedSum method
                ListNode result = LinkedSum(l1, l2);

                // Print the result
                System.out.print("Result: ");
                while (result != null) {
                    System.out.print(result.val);
                    result = result.next;
                    if (result != null) {
                        System.out.print(" -> ");
                    }
                }
            }

            static ListNode LinkedSum(ListNode l1, ListNode l2) {
                ListNode head = new ListNode(0);
                ListNode tail = head;
                int carry = 0;

                while (l1 != null || l2 != null || carry != 0) {
                    int digit1 = (l1 != null) ? l1.val : 0;
                    int digit2 = (l2 != null) ? l2.val : 0;

                    int sum = digit1 + digit2 + carry;
                    int digit = sum % 10;
                    carry = sum / 10;

                    ListNode newNode = new ListNode(digit);
                    tail.next = newNode;
                    tail = tail.next;

                    l1 = (l1 != null) ? l1.next : null;
                    l2 = (l2 != null) ? l2.next : null;
                }

                ListNode result = head.next;
                head.next = null;
                return result;
            }
}