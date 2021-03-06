package Lab04;

public class LinkedList {

    public Node head;

    /* First Constructor:
   * Creates a linked list using the values from the given array. head will refer
   * to the Node that contains the element from a[0]
     */
    public LinkedList(Object[] a) {
        // TO DO
        head = new Node(a[0], null);
        Node now = head;
        for (int i = 1; i < a.length; i++) {
            Node temp = new Node(a[i], null);
            now.next = temp; //Take Previouse Node Refarence
            now = now.next;
        }
    }

    /* Second Constructor:
   * Sets the value of head. head will refer
   * to the given LinkedList
     */
    public LinkedList(Node h) {
        // TO DO
    }

    /* Counts the number of Nodes in the list */
    public int countNode() {
        // TO DO
        int count = 0;
        for (Node now = head; now != null; now = now.next) {
            count++;
        }
        return count; // please remove this line!
    }

    /* prints the elements in the list */
    public void printList() {
        // TO DO
        for (Node now = head; now != null; now = now.next) {
            System.out.print(now.element + " ");
        }
        System.out.println();
    }

    // returns the reference of the Node at the given index. For invalid index return null.
    public Node nodeAt(int idx) {
        // TO DO
        if (idx < 0 || idx >= countNode()) {
            return null;
        }
        Node now = head;
        for (int i = 0; i < idx; i++) {
            now = now.next;
        }
        return now;
    }

// returns the element of the Node at the given index. For invalid idx return null.
    public Object get(int idx) {
        // TO DO
        if (idx < 0 || idx >= countNode()) {
            return null;
        }
        Node now = head;
        for (int i = 0; i < idx; i++) {
            now = now.next;
        }
        return now.element; // please remove this line!
    }

    /* updates the element of the Node at the given index. 
   * Returns the old element that was replaced. For invalid index return null.
   * parameter: index, new element
     */
    public Object set(int idx, Object elem) {
        // TO DO
        if (idx < 0 || idx > countNode()) {
            return null;
        }
        int c = 0;
        for (Node now = head; now != null; now = now.next) {
            if (c == idx) {
                now.element = elem;
                return now.element;
            }
            c++;
        }
        return null;
    }

    /* returns the index of the Node containing the given element.
   if the element does not exist in the List, return -1.
     */
    public int indexOf(Object elem) {
        // TO DO
        int c = 0;
        for (Node now = head; now != null; now = now.next) {
            if (now.element == elem) {
                return c;
            }
            c++;
        }
        return -1; // please remove this line!
    }

    // returns true if the element exists in the List, return false otherwise.
    public boolean contains(Object elem) {
        // TO DO
        for (Node now = head; now != null; now = now.next) {
            if (now.element == elem) {
                return true;
            }
        }
        return false; // please remove this line!
    }

    // Makes a duplicate copy of the given List. Returns the reference of the duplicate list.
    public Node copyList() {
        // TO DO
        for (Node now = head; now != null; now = now.next) {
            return now;
        }
        return null;
    }

    // Makes a reversed copy of the given List. Returns the head reference of the reversed list.
    public Node reverseList() {
        // TO DO
        return null; // please remove this line!
    }

    /* inserts Node containing the given element at the given index
   * Check validity of index.
     */
    public void insert(Object elem, int idx) {
        // TO DO
    }

    /* removes Node at the given index. returns element of the removed node.
   * Check validity of index. return null if index is invalid.
     */
    public Object remove(int index) {
        // TO DO
        return null; // please remove this line!
    }

    // Rotates the list to the left by 1 position.
    public void rotateLeft() {
        // TO DO
    }

    // Rotates the list to the right by 1 position.
    public void rotateRight() {
        // TO DO
    }

}
