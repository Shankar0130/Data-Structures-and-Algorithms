package LinkedList;

import java.util.HashMap;

class FloydLoop {
    static class Node {
        Node prev;
        Node next;
        int data;

        Node(int val) {
            data = val;
            prev = null;
            next = null;
        }
    }

    static class DoublyLinkedList {
        Node head;

        DoublyLinkedList() {
            head = null;
        }

        void insertBegin(int ins_val) {
            Node new_node = new Node(ins_val);

            if (head != null) {
                new_node.next = head;
                head.prev = new_node;

            }

            head = new_node;

        }

        void printList() {
            Node node = head;
            while (node != null) {
                System.out.println(node.data);
                node = node.next;
            }
        }

        void detectLoop() {
            Node slow = head;
            Node fast = head.next;

            while (slow != null) {

                if (slow == fast) {
                    System.out.println("Loop Detected");
                    return;
                }
                fast = fast.next.next;
                slow = slow.next;
            }
        }

        void detectLoopHash() {
            HashMap<Node, Node> hm = new HashMap<>();
            Node node = head;

            while (node != null) {

                if (hm.containsKey(node)) {
                    System.out.println("Loop detected");
                    return;
                }
                hm.put(node, node);

                node = node.next;
            }

        }
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        dll.insertBegin(10);
        dll.insertBegin(20);
        dll.insertBegin(30);
        dll.insertBegin(40);
        dll.insertBegin(50);

        dll.head.next.next.next.next.next = dll.head.next;

        dll.detectLoopHash();

    }
}
