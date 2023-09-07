public class Intersection {
    public static  ListNode  getIntersectionNode(ListNode headA, ListNode headB) {

            //listA = [4,1,8,4,5]
            //listB = [5,6,1,8,4,5]
        if(headA==null || headB==null)
            return null;

        ListNode a=headA;
        ListNode b=headB;

        while(a!=b)    {
            //a=a==null?headB:a.next;
            if(a==null){
                a=headB;
            }else{
                a=a.next;
            }

            //b=b==null?headA:b.next;
            if(b==null){
                b=headA;
            }else{
                b=b.next;
            }
        }
        return a;
    }

}
