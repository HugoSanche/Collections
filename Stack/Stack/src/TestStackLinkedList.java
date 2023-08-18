public class TestStackLinkedList {
    public static void main(String[] args) {
        StackLinkedList stackLinkedList=new StackLinkedList();

        boolean result=stackLinkedList.isEmpty();
        System.out.println(result);

        //test push
        stackLinkedList.push(1);
        stackLinkedList.push(2);
        stackLinkedList.push(3);

        //test isEmpty
        boolean result2=stackLinkedList.isEmpty();
        System.out.println(result2);

        //test pop
       int result3=  stackLinkedList.pop();
        System.out.println(result3);
        int result4=  stackLinkedList.pop();
        System.out.println(result4);

        //test peek
        int result5=  stackLinkedList.peek();
        System.out.println(result5);

        stackLinkedList.delete();;
    }
}
