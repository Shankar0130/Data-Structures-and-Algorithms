package LinkedList;

class Node {
    int data;
    Node prev;
    Node next;

    // Constructor to create a new node
    // next and prev is by default initialized as null
    Node(int d) {
        data = d;
    }
}

class DLLs {
    Node head; // head of list

    /* Doubly Linked list Node */

    // Adding a node at the front of the list
    public void push(int new_data) {
        /*
         * 1. allocate node 2. put in the data
         */
        Node new_Node = new Node(new_data);

        /* 3. Make next of new node as head and previous as NULL */
        new_Node.next = head;
        new_Node.prev = null;

        /* 4. change prev of head node to new node */
        if (head != null)
            head.prev = new_Node;

        /* 5. move the head to point to the new node */
        head = new_Node;
    }

    /*
     * Given a node as prev_node, insert a new node after the given node
     */
    public void InsertAfter(Node prev_Node, int new_data) {
        Node new_node = new Node(new_data);

        new_node.next = prev_Node.next;
        prev_Node.next = new_node;
        new_node.prev = prev_Node;
        new_node.next.prev = new_node;

    }

    void insertBeforeValue(int val, int insval) {
        Node node = head;

        if (node == null) {
            return;
        }

        while (node.data != val) {
            node = node.next;
        }

        Node new_node = new Node(insval);

        new_node.prev = node.prev;
        new_node.next = node;
        node.prev = new_node;
        new_node.prev.next = new_node;
    }

    // Add a node at the end of the list
    void append(int new_data) {
        Node new_node = new Node(new_data);
        Node node = head;
        while (node.next != null) {
            node = node.next;
        }
        node.next = new_node;
        new_node.next = null;
        new_node.prev = node;
    }

    void reverse() {

        Node tr = head;
        Node temp = null;

        while (tr != null) {
            temp = tr.prev;
            tr.prev = tr.next;
            tr.next = temp;

            tr = tr.prev;
        }
        head = temp.prev;

    }

    // This function prints contents of
    // linked list starting from the given node
    public void printlist(Node node) {
        Node last = null;
        System.out.println("Traversal in forward Direction");
        while (node != null) {
            System.out.print(node.data + " ");
            last = node;
            node = node.next;
        }
        // System.out.println();
        // System.out.println("Traversal in reverse direction");
        // while (last != null) {
        // System.out.print(last.data + " ");
        // last = last.prev;
        // }
    }

    void delete(int del_val) {

        Node moveNode = head;
        while (moveNode.data != del_val) {
            moveNode = moveNode.next;
        }

        moveNode.prev.next = moveNode.next;
        moveNode.next.prev = moveNode.prev;

        moveNode.prev = null;
        moveNode.next = null;
    }

    /* Driver program to test above functions */
    public static void main(String[] args) {
        /* Start with the empty list */
        DLLs dll = new DLLs();

        // Insert 6. So linked list becomes 6->NULL

        // Insert 7 at the beginning. So
        // .. linked list becomes 7->6->NULL

        // Insert 4 at the end. So linked
        // list becomes 1->7->6->4->NULL

        dll.push(7);

        // Insert 1 at the beginning. So
        // linked list becomes 1->7->6->NULL
        dll.push(1);
        dll.push(10);
        dll.push(20);

        dll.InsertAfter(dll.head, 22);
        dll.insertBeforeValue(1, 11);
        dll.append(50);

        dll.reverse();

        // Insert 8, after 7. So linked
        // list becomes 1->7->8->6->4->NULL
        // dll.InsertAfter(dll.head.next, 8);

        System.out.println("Created DLL is: ");
        dll.printlist(dll.head);
    }
}
