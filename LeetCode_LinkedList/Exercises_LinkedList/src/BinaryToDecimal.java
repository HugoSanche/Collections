public class BinaryToDecimal {
    public int getDecimalValue(ListNode head) {

        int cont=0;
        ListNode current=head;
        while(head!=null){
            cont+=1;
            head=head.next;
        }
        cont=cont-1;
        double operation=0;
        while (current!=null){
            if(current.val==0){
                operation+=0;
            }else{
                operation=operation+current.val*Math.pow(2,cont);
            }
            cont-=1;
            current=current.next;
        }
        return (int) operation;
    }
}
