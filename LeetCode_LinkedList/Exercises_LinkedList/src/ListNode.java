public class ListNode {
         int val;
      ListNode next;
      ListNode() {}
     ListNode(int val)
     {
         this.val = val;
     }
      ListNode(int val, ListNode next) {
          this.val = val;
          this.next = next;
      }

    public static void transversal(ListNode list){

         while(list !=null){
             System.out.print(list.val);
             if (list !=null) {
                 System.out.print("-> ");
             }
             list=list.next;
         }
            System.out.println();

    }
}
