public class TestStackLinkedList {
    public static void main(String[] args) {
        StackLinkedList stackLinkedList=new StackLinkedList();

        boolean result=stackLinkedList.isEmpty();
        System.out.println(result);

        stackLinkedList.push(1);
        stackLinkedList.push(2);
        stackLinkedList.push(3);

        boolean result2=stackLinkedList.isEmpty();
        System.out.println(result2);
    }
}
