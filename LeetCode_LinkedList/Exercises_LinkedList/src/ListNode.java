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

    public void addSameNode(LinkedListLeet llA,LinkedListLeet llB,int nodeValue){
        ListNode newNode=new ListNode();
        newNode.val=nodeValue;
        llA.tail.next=newNode;
        llA.tail=newNode;
        llB.tail.next=newNode;
        llB.tail=newNode;
    }
}
