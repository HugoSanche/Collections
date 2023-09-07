public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            int carry=0;
            ListNode temp= new ListNode(0); //save all nodes since the beginning
            ListNode currentNode=temp;
            while(l1 !=null || l2!=null || carry !=0){
                int result=carry;
                if (l1 !=null){
                    result+=l1.val;
                    l1=l1.next;
                }
                if (l2 !=null){
                    result+=l2.val;
                    l2=l2.next;
                }
                currentNode.next= new ListNode(result%10); //create new node en the Next
                currentNode=currentNode.next; //continue with the next node
                carry=result/10;
            }
            return temp.next;
        }
        public ListNode getKthNode(ListNode head, int k){
            ListNode currentNode= head;
            while(k>0){
                currentNode=currentNode.next;
                k--;
            }
            return currentNode;
        }
        public ListNode findIntersection(LinkedListLeet list1, LinkedListLeet list2){
            if (list1==null || list2==null){
                return null;
            }
            if(list1.tail!=list2.tail){
                return null;
            }
            ListNode shorter=new ListNode();
            ListNode longer=new ListNode();
            if(list1.size>list2.size){
                longer=list1.head;
                shorter=list2.head;
            }else{
                shorter=list1.head;
                longer=list2.head;
            }
            longer=getKthNode(longer,Math.abs(list1.size-list2.size));
            while (longer!=shorter){
                longer=longer.next;
                shorter=shorter.next;
            }
            return longer;
        }
        // add some noe
    public void addSameNode(LinkedListLeet llA,LinkedListLeet llB,int nodeValue){
        ListNode newNode=new ListNode();
        newNode.val=nodeValue;
        llA.tail.next=newNode;
        llA.tail=newNode;
        llB.tail.next=newNode;
        llB.tail=newNode;
    }
}
