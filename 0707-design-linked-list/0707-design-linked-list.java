class MyLinkedList {

    class Node {
        int val;
        Node next;
        public Node (int v) {
            val = v;
        }

        public Node(int v, Node n) {
            next = n;
            val = v;
        }

        public String toString() {
            String s = "";
            Node c = this;
            while(c != null) {
                s += "" + c.val + "->";
                c = c.next;
            }
            return s;
        }
    }

    private Node head;
    private Node tail;
    private int len;

    public MyLinkedList() {
        head = null;
        tail = null;
        len = 0;
    }
    
    public int get(int index) {
        Node h = this.head;
        if(index >= this.len || index < 0) {
            return -1;
        }
        Node c = this.head;
        int i = 0;
        while(i < index) {
            c = c.next;
            i++;
        }

        return c.val;
    }
    
    public void addAtHead(int val) {
        Node h = this.head;
        if(isEmpty()) {
            initializeFirstNode(val);
            return;
        }

        // note: this.tail is not impacted in this case
        Node newHead = new Node(val);
        newHead.next = this.head;
        this.head = newHead;
        this.len++;
    }
    
    public void addAtTail(int val) {
        Node h = this.head;
        if(isEmpty()) {
            initializeFirstNode(val);
            return;
        }

        // note: this does not impact this.head
        Node newNode = new Node(val);
        this.tail.next = newNode;
        this.tail = newNode;
        this.len++;
    }
    
    public void addAtIndex(int index, int val) {
        // note: index is zero-indexed
        Node h = this.head;
        if(index > this.len || index < 0) {
            return;
        }

        if(index == this.len) {
            addAtTail(val);
            return;
        }

        if(index == 0) {
            addAtHead(val);
            return;
        }

        // must be adding in between head and tail
        Node prev = null;
        Node curr = this.head;
        int i = 0;
        while(i < index) {
            prev = curr;
            curr = curr.next;
            i++;
        }

        // curr is now at the index we want to insert a new node at
        // new node should point to curr
        Node node = new Node(val, curr);
        // previous should point to the new node
        prev.next = node;
        this.len++;
    }
    
    public void deleteAtIndex(int index) {
        Node h = this.head;
        if(index >= this.len || index < 0 || isEmpty()) {
            return;
        }

        if(index == 0) {
            // special case: remove the head
            // if list is empty now, this is handled below
            this.head = this.head.next;
        } else if(index == this.len - 1) {
            // need to find the node before the tail
            Node curr = this.head;
            Node prev = null;
            while(curr != this.tail) {
                prev = curr;
                curr = curr.next;
            }
            
            this.tail = prev;
        } else {
            Node prev = null;
            Node curr = this.head;
            int i = 0;
            while(i < index) {
                prev = curr;
                curr = curr.next;
                i++;
            }

            // curr is the node to delete
            // so skip it
            prev.next = curr.next;
            // make sure things get gc'd
            curr = null;
        }

        this.len--;
        if(this.len == 0) {
            this.head = null;
            this.tail = null;
        }
    }

    private boolean isEmpty() {
        return this.len == 0;
    }

    // at the end of this method, head and tail must be non null and point to the same node
    private void initializeFirstNode(int val) {
        this.head = new Node(val);
        this.tail = this.head;
        this.len++;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */