package LinkedList;

class SingleLinkedList {
    static class Node {
        Node next;
        int data;

        Node(int val) {
            data = val;
            next = null;
        }
    }

    static class SinglyLinked {
        Node head;

        SinglyLinked() {
            head = null;
        }

        void insertValue(int ins_val) {
            Node newNode = new Node(ins_val);
            if (head == null) {
                head = newNode;
            } else {
                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = newNode;
            }

        }

        void insertBegin(int ins_val) {
            Node newNode = new Node(ins_val);
            if (head != null) {
                newNode.next = head;
            }
            head = newNode;
        }

        void printList() {
            while (head != null) {
                System.out.print(head.data + " ");
                head = head.next;
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        SinglyLinked sll = new SinglyLinked();

        sll.insertValue(10);
        sll.insertValue(20);
        sll.insertBegin(5);
        sll.insertBegin(15);
        sll.insertValue(30);

        sll.printList();

    }

}
