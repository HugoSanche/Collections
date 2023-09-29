/*
2181. Merge Nodes in Between Zeros
        Medium
        1.6K
        28
        Companies
        You are given the head of a linked list, which contains a series of integers separated by 0's. The beginning and end of the linked list will have Node.val == 0.

        For every two consecutive 0's, merge all the nodes lying in between them into a single node whose value is the sum of all the merged nodes. The modified list should not contain any 0's.

        Return the head of the modified linked list.

        Input: head = [0,3,1,0,4,5,2,0]
Output: [4,11]
Explanation:
The above figure represents the given linked list. The modified list contains
- The sum of the nodes marked in green: 3 + 1 = 4.
- The sum of the nodes marked in red: 4 + 5 + 2 = 11.
 */

public class MergeNodesBetweenZeros {
    public ListNode mergeNodes(ListNode head) {
        ListNode currentNode=new ListNode(-1);
        ListNode temp=currentNode;
        head=head.next;
        int sum=0;
        while (head!=null){
            if (head.val!=0){
                sum+=head.val;
            }
            if (head.val==0){
                ListNode insert=new ListNode(sum);
                sum=0;
                currentNode.next=insert;
                currentNode=currentNode.next;
            }
            head=head.next;
        }
        return temp.next;
    }
}
