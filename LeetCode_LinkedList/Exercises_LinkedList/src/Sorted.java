//21. Merge Two Sorted Lists
//        You are given the heads of two sorted linked lists list1 and list2.
//        Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
//        Return the head of the merged linked list.
//Input: list1 = [1,2,4], list2 = [1,3,4]
//Output: [1,1,2,3,4,4]
//Example 2:
//
//Input: list1 = [], list2 = []
//Output: []
//Example 3:
//
//Input: list1 = [], list2 = [0]
//Output: [0]
//
//
//Constraints:
//
//The number of nodes in both lists is in the range [0, 50].
//-100 <= Node.val <= 100
//Both list1 and list2 are sorted in non-decreasing order.


public class Sorted {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode mergue=new ListNode();
        ListNode tempNode1=mergue;
        if (list1==null && list2==null){
            return null;
        }
            while (list1!=null || list2!=null){



                    if (list1!=null && list2!=null){
                        if (list1.val>list2.val){
                            mergue.val=list2.val;
                            list2=list2.next;
                        } else if (list1.val<list2.val) {
                            mergue.val=list1.val;
                            list1=list1.next;
                        }else{
                            mergue.val=list1.val;
                            list1=list1.next;

                            mergue.next=new ListNode();
                            mergue=mergue.next;

                            mergue.val=list2.val;
                            list2=list2.next;
                            mergue.next=new ListNode();
                            mergue=mergue.next;
                            continue;
                        }
                    }
                if (list1==null && list2!=null || list1!=null && list2==null || list1!=null && list2!=null ){
                    mergue.next=new ListNode();
                    mergue=mergue.next;
                    continue;
                }
                if (list1==null){
                    mergue.val=list2.val;
                    list2=list2.next;

                    if (list2==null){
                      continue;
                    }
                    mergue.next=new ListNode();
                    mergue=mergue.next;
                    continue;
                }

                if (list2==null){
                    mergue.val=list1.val;
                    list1=list1.next;

                    if (list1==null){
                        continue;
                    }
                    mergue.next=new ListNode();
                    mergue=mergue.next;
                    continue;
                }

            }
            return tempNode1;
    }

    public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }

        ListNode mergeHead;
        if(l1.val < l2.val){
            mergeHead = l1;
            mergeHead.next = mergeTwoLists2(l1.next, l2);
        }
        else{
            mergeHead = l2;
            mergeHead.next = mergeTwoLists2(l1, l2.next);
        }
        return mergeHead;
    }

    public ListNode mergeTwoLists3(ListNode l1, ListNode l2) {
        ListNode tempNode1=new ListNode();
        ListNode merge=tempNode1;
        while (l1!=null && l2!=null) {
            if (l1.val <= l2.val) {
                //merge.val=l1.val;
                merge.next = l1;
                l1 = l1.next;
            } else {
                //merge.val=l2.val;
                merge.next = l2;
                l2 = l2.next;
            }
        merge=merge.next;
        }
            if(l1!=null){
                merge.next=l1;
            } else if (l2!=null) {
                merge.next=l2;
            }

        return tempNode1.next;
    }
}
