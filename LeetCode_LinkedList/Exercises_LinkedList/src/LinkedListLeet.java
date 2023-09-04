import java.util.ArrayList;
import java.util.List;

public class LinkedListLeet {
    ListNode head;
    ListNode tail;
    int size = 1;

    public void createLL(int value) {
        ListNode node = new ListNode();
        node.val = value;
        node.next = null;
        head = node;
        tail = node;
        size = 1;
    }

    public void insertLL(int value) {
        if (head==null){
            createLL(value);
            return;
        }
        ListNode newNode = new ListNode();
        newNode.next = null;
        newNode.val = value;
        tail.next = newNode; //reference to last node to the new node. Because tail has the reference from de last node create
        tail = newNode;
        size++;
    }
    public void deleteSLL(){
        head=null;
        tail=null;
        System.out.println("The sLL deleted successfully");
    }

    public void traversalLL() {
        ListNode tempNode = head;
        for (int i = 0; i < size; i++) {
            System.out.print(tempNode.val);
            if (i != size - 1) {
                System.out.print("-> ");
            }
            tempNode = tempNode.next;
        }
        System.out.println();
    }

    //linkedList = 1->2->1->3
    //Output
    // 1->2->3

    //Delete values duplicates
    //We need current node and last node. Because if the value is repeated. The last node work a link between the next node of current node.
    public void deleteDups(LinkedListLeet ll) {
        List<Integer> listValues = new ArrayList<>();
        ListNode tempNode = ll.head;
        ListNode prevNode = ll.head; //This is last node
        listValues.add(tempNode.val);
        tempNode = ll.head.next; //This is current node
        while (tempNode != null) {
            if (listValues.contains(tempNode.val)) {
                prevNode.next = tempNode.next; //Here exclude the node was repeated
                ll.size--;
            }
            listValues.add(tempNode.val);
            tempNode = tempNode.next;
            prevNode = prevNode.next;
        }
    }

    // Given a Linked List and a number N, write a function that returns the value at the Nth node from the end of the Linked List.
    //Implement and algorithm to find the nth to last element of a singly linked list.
    //       Example
    //     linkedList = 1->2->3->4->5
    //deleteDups(linkedList, 2)
    //Output
    //4
    // Input: 35 -> 15 -> 4 -> 20, N = 4
    // Output: 35
    public void nthToLast(LinkedListLeet ll, int valueToFound) {
        if (valueToFound > ll.size) {
            System.out.println("Incorrect Value");
        } else {
            ListNode currentNode = head;
            int nodeToFound = (ll.size - valueToFound) + 1;
            for (int i = 1; i <= nodeToFound + 1; i++) {
                if (i == nodeToFound) {
                    System.out.println(currentNode.val);
                }
                currentNode = currentNode.next;
            }
        }
    }

    public void reArrange(LinkedListLeet ll, int separate) {
        if (ll.head == null) {
            System.out.println("Incorrect Value");
        } else {
            List<Integer> lesser = new ArrayList<>();
            ListNode tempNode = ll.head;
            for (int i = 0; i < ll.size; i++) {
                if (tempNode.val < separate) {
                    lesser.add(tempNode.val);
                }
                tempNode = tempNode.next;
            }
            int index = 0;
            while (lesser.size() > index) {
                System.out.print(lesser.get(index));
                if (ll.size > index) {
                    System.out.print("->");
                }
                index++;
            }
            tempNode = ll.head;
            for (int i = 0; i < ll.size; i++) {
                if (!lesser.contains(tempNode.val)) {
                    System.out.print(tempNode.val);
                    if (i != ll.size - 1) {
                        System.out.print("->");
                    }

                }
                tempNode = tempNode.next;
            }
        }
    }

    public LinkedListLeet reArrange_(LinkedListLeet ll, int separate) {
        ListNode currentNode = ll.head;
        ll.tail = ll.head;
        while (currentNode != null) {
            ListNode next = currentNode.next;
            if (currentNode.val < separate) {
                currentNode.next = ll.head;
                ll.head = currentNode;
            } else {
                ll.tail.next = currentNode;
                ll.tail = currentNode;
            }
            currentNode = next;
        }
        ll.tail.next = null;
        return ll;
    }
}