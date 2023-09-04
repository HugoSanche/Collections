import java.util.ArrayList;
import java.util.List;

public class LinkedList {
    Node head;
    Node tail;
    int size = 1;

    public void createLL(int value) {
        Node node = new Node();
        node.value = value;
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
        Node newNode = new Node();
        newNode.next = null;
        newNode.value = value;
        tail.next = newNode; //reference to last node to the new node. Because tail has the reference from de last node create
        tail = newNode;
        size++;
    }

    public void traversalLL() {
        Node tempNode = head;
        for (int i = 0; i < size; i++) {
            System.out.print(tempNode.value);
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
    public void deleteDups(LinkedList ll) {
        List<Integer> listValues = new ArrayList<>();
        Node tempNode = ll.head;
        Node prevNode = ll.head; //This is last node
        listValues.add(tempNode.value);
        tempNode = ll.head.next; //This is current node
        while (tempNode != null) {
            if (listValues.contains(tempNode.value)) {
                prevNode.next = tempNode.next; //Here exclude the node was repeated
                ll.size--;
            }
            listValues.add(tempNode.value);
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
    public void nthToLast(LinkedList ll, int valueToFound) {
        if (valueToFound > ll.size) {
            System.out.println("Incorrect Value");
        } else {
            Node currentNode = head;
            int nodeToFound = (ll.size - valueToFound) + 1;
            for (int i = 1; i <= nodeToFound + 1; i++) {
                if (i == nodeToFound) {
                    System.out.println(currentNode.value);
                }
                currentNode = currentNode.next;
            }
        }
    }

    public void reArrange(LinkedList ll, int separate) {
        if (ll.head == null) {
            System.out.println("Incorrect Value");
        } else {
            List<Integer> lesser = new ArrayList<>();
            Node tempNode = ll.head;
            for (int i = 0; i < ll.size; i++) {
                if (tempNode.value < separate) {
                    lesser.add(tempNode.value);
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
                if (!lesser.contains(tempNode.value)) {
                    System.out.print(tempNode.value);
                    if (i != ll.size - 1) {
                        System.out.print("->");
                    }

                }
                tempNode = tempNode.next;
            }
        }
    }

    public LinkedList reArrange_(LinkedList ll, int separate) {
        Node currentNode = ll.head;
        ll.tail = ll.head;
        while (currentNode != null) {
            Node next = currentNode.next;
            if (currentNode.value < separate) {
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