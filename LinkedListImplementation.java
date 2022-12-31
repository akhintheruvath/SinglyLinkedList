public class LinkedListImplementation {
    Node head = null;

    public void addAtBeginning(int data) {
        Node newHeadNode = new Node();
        newHeadNode.data = data;
        if (head == null) {
            head = newHeadNode;
        } else {
            newHeadNode.next = head;
            head = newHeadNode;
        }
    }

    public void addAtPosition(int position, int data) {
        --position;
        int pos = 0;
        Node temp = head;
        Node newNode = new Node();
        newNode.data = data;
        if (position == 0) {
            addAtBeginning(data);
        } else if (length() >= position) {
            while (pos < position - 1) {
                temp = temp.next;
                ++pos;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        } else
            System.out.println("Entered position is greater than the size of the linked list");
    }

    public void append(int data) {
        Node node = new Node();
        node.data = data;
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public int length() {
        Node temp = head;
        int len;
        for (len = 0; temp != null; ++len) {
            temp = temp.next;
        }
        return len;
    }

    public void deleteByPosition(int position) {
        if (length() < position) {
            System.out.println("Invalid position entered");
        } else if (position == 1) {
            head = head.next;
        } else {
            int pos = 0;
            Node temp = head;
            Node temp2;
            --position;
            while (pos < position - 1) {
                ++pos;
                temp = temp.next;
            }
            temp2 = temp.next;
            temp.next = temp2.next;
        }
    }

    public void swapAdjacent(int position) {
        if (position > length() - 1) {
            System.out.println("Invalid position entered");
        } else {
            --position;
            int pos = 0;
            Node temp1 = head;
            Node temp2, temp3;
            while (pos < position - 1) {
                temp1 = temp1.next;
                ++pos;
            }
            temp2 = temp1.next;
            temp3 = temp2.next;

            temp1.next = temp3;
            if (position != 0) {
                temp2.next = temp3.next;
                temp3.next = temp2;
            } else {
                temp2.next = temp1;
                head = temp2;
            }
        }
    }

    public void reverse() {
        Node nextNode = null;
        Node prevNode = null;
        while (head != null) {
            nextNode = head.next;
            head.next = prevNode;
            prevNode = head;
            head = nextNode;
        }
        head = prevNode;
    }
}