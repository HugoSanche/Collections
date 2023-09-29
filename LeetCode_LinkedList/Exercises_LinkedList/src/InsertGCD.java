/*
2807. Insert Greatest Common Divisors in Linked List
Medium
325
11
Companies
Given the head of a linked list head, in which each node contains an integer value.

Between every pair of adjacent nodes, insert a new node with a value equal to the greatest common divisor of them.

Return the linked list after insertion.

The greatest common divisor of two numbers is the largest positive integer that evenly divides both numbers.


Input: head = [18,6,10,3]
Output: [18,6,6,2,10,1,3]
Explanation: The 1st diagram denotes the initial linked list and the 2nd diagram denotes the linked list after inserting the new nodes (nodes in blue are the inserted nodes).
- We insert the greatest common divisor of 18 and 6 = 6 between the 1st and the 2nd nodes.
- We insert the greatest common divisor of 6 and 10 = 2 between the 2nd and the 3rd nodes.
- We insert the greatest common divisor of 10 and 3 = 1 between the 3rd and the 4th nodes.
There are no more adjacent nodes, so we return the linked list.
 */

public class InsertGCD {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode prev;
        prev=head;

        while(prev.next!=null){
            double result=GCD(prev.val,prev.next.val);
            ListNode insert=new ListNode((int)result);

            insert.next=prev.next;
            prev.next=insert;
            prev= prev.next.next;
        }
        return head;
    }
    public static double GCD(double number1, double number2){
        if (number2==0){
            return number1;
        }
        return GCD(number2,number1%number2);
    }
}
