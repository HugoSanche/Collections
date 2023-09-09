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
}
