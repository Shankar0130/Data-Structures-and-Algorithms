package LinkedList;

class FindMiddle {

    static Node head;

    // Link list node
    class Node {
        int data;
        Node next;

        // Constructor
        public Node(Node next, int data) {
            this.data = data;
            this.next = next;
        }
    }

    // Function to get the middle of
    // the linked list
    void printMiddle(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        System.out.println("The middle element is " + slow.data);
    }

    void printMidCounter(Node head) {
        int counter = 0;
        Node mid = head;

        while (head != null) {
            if ((counter % 2) == 1) {
                mid = mid.next;
            }

            counter++;
            head = head.next;
        }

        if (mid != null)
            System.out.println("The middle element is: " + mid.data);
    }

    void push(Node head_ref, int new_data) {

        // Allocate node
        Node new_node = new Node(head_ref, new_data);

        // Move the head to point to the new node
        head = new_node;
    }

    // A utility function to print a
    // given linked list
    void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + "-> ");
            head = head.next;
        }
        System.out.println("null");
    }

    // Driver code
    public static void main(String[] args) {
        FindMiddle ll = new FindMiddle();

        for (int i = 5; i > 0; i--) {
            ll.push(head, i);
            ll.printList(head);
            ll.printMiddle(head);
        }
    }
}

// This code is contributed by mark_3
