package LinkedList;

class MergeLinkedList {

    static class Node {
        Node prev;
        Node next;
        int data;

        Node(int val) {
            data = val;
        }
    }

    static class DoublyLinkedList {
        Node head;

        DoublyLinkedList() {
            head = null;
        }

        void insertValueBegin(int val) {
            Node new_node = new Node(val);

            if (head != null) {
                new_node.next = head;
                head.prev = new_node;
            }

            head = new_node;
        }

    }

    static void sortList(Node node) {
        Node current = node;
        Node temp = null;

        while (current != null) {

            if (node.data > node.next.data) {

            }
        }
    }

    static void printList(Node node) {
        Node travel = node;

        while (travel != null) {
            System.out.print(travel.data + " ");
            travel = travel.next;
        }
        System.out.println();
    }

    static void mergeList(DoublyLinkedList dll1, DoublyLinkedList dll2) {
        Node head1 = dll1.head;
        Node head2 = dll2.head;
        Node tail = null;

        DoublyLinkedList dll3 = new DoublyLinkedList();

        if (head1 == null) {
            dll3 = dll2;
        }

        if (head2 == null) {
            dll3 = dll1;
        }

        if (head1.data <= head2.data) {
            tail = head1;
            head1 = head1.next;
        } else {
            tail = head2;
            head2 = head2.next;
        }

        dll3.head = tail;

        while (head1 != null && head2 != null) {
            Node temp = null;
            if (head1.data <= head2.data) {
                temp = head1;
                head1 = head1.next;
            } else {
                temp = head2;
                head2 = head2.next;
            }

            tail.next = temp;
            tail = temp;
        }

        if (head1 != null) {
            tail.next = head1;
        } else if (head2 != null) {
            tail.next = head2;
        }

        printList(dll3.head);

    }

    public static void main(String[] args) {
        DoublyLinkedList dll1 = new DoublyLinkedList();
        DoublyLinkedList dll2 = new DoublyLinkedList();

        dll1.insertValueBegin(30);
        dll1.insertValueBegin(25);
        dll1.insertValueBegin(20);
        dll1.insertValueBegin(15);
        dll1.insertValueBegin(12);
        dll1.insertValueBegin(9);
        dll1.insertValueBegin(8);

        dll2.insertValueBegin(13);
        dll2.insertValueBegin(11);
        dll2.insertValueBegin(10);
        dll2.insertValueBegin(7);

        printList(dll1.head);
        printList(dll2.head);

        mergeList(dll1, dll2);
    }
}