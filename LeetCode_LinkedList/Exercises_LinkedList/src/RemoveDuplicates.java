public class RemoveDuplicates {
  //  83. Remove Duplicates from Sorted List
//Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.
//
// Input: head = [1,1,2]
//Output: [1,2]
    //Input: head = [1,1,2,3,3]
    //Output: [1,2,3]
    //
    //
    //Constraints:
    //
    //The number of nodes in the list is in the range [0, 300].
    //-100 <= Node.val <= 100
    //The list is guaranteed to be sorted in ascending order.
  public ListNode deleteDuplicates(ListNode head) {
      if (head==null || head.next==null){
          return head;
      }
      ListNode header;
              header=head;
    while(header.next!=null){
         if(header.val==header.next.val){
             header.next=header.next.next;
         }else {
             header=header.next;
         }
    }
    return head;
  }
}
