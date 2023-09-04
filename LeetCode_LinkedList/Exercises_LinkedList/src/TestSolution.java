public class TestSolution {
    public static void main(String[] args) {
        Solution solution=new Solution();
        ListNode node1=new ListNode(2);
        node1=node1.next;
        node1.val=4;
        node1=node1.next;
        node1.val=3;

        ListNode node2=new ListNode(5);
        node2=node2.next;
        node2.val=6;
        node2=node2.next;
        node2.val=4;

        solution.addTwoNumbers(node1,node2);

    }
}
