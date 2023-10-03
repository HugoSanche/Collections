import java.util.Arrays;

public class Test_SpiralMatrixIV {
    public static void main(String[] args) {
        ListNode node1=new ListNode(3);
        ListNode tempNode1=node1;
        node1.next=new ListNode(0);
        node1=node1.next;
        node1.next=new ListNode(2);
        node1=node1.next;
        node1.next=new ListNode(6);
        node1=node1.next;
        node1.next=new ListNode(8);
        node1=node1.next;
        node1.next=new ListNode(1);
        node1=node1.next;
        node1.next=new ListNode(7);
        node1=node1.next;
        node1.next=new ListNode(9);
        node1=node1.next;
        node1.next=new ListNode(4);
        node1=node1.next;
        node1.next=new ListNode(2);
        node1=node1.next;
        node1.next=new ListNode(5);
        node1=node1.next;
        node1.next=new ListNode(5);
        node1=node1.next;
        node1.next=new ListNode(0);

        ListNode.transversal(tempNode1);
        SpiralMatrixIV  spiralMatrixIV=new SpiralMatrixIV();
        int[][] result=spiralMatrixIV.spiralMatrix(3,5,tempNode1);
        System.out.println(Arrays.deepToString(result));

    }
}














