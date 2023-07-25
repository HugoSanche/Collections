public class Main {
    public static void main(String[] args) {

        SinglyLinkedList sLL=new SinglyLinkedList();
        sLL.createSinglyLinkedList(1);
        //System.out.println(sLL.head.value);
        sLL.insertInLinkedList(3,2);
        sLL.insertInLinkedList(4,3);
        sLL.insertInLinkedList(5,4);
        sLL.insertInLinkedList(6,5);
        sLL.traverseSingleLinkedList();
        //System.out.println(sLL.head.next.value);
        System.out.println("Search Value Node");
        boolean search=sLL.searchSingleLinkedList(7);

        sLL.deleteSLL();
        sLL.traverseSingleLinkedList();
    }
}