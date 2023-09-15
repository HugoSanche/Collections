public class Test_Palindrome {
    public static void main(String[] args) {
        ListNode node1=new ListNode(1);
        ListNode tempNode1=node1;
        node1.next=new ListNode(2);
//        node1=node1.next;
//        node1.next=new ListNode(2);
//        node1=node1.next;
//        node1.next=new ListNode(1);
        ListNode.transversal(tempNode1);
        Palindrome  palindrome=new Palindrome();
        boolean result=palindrome.isPalindrome(tempNode1);
        System.out.println(result);
    }
}
