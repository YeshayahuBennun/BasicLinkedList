public class BasicLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public BasicLinkedList() {
        this.size = 0;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void add(String value) {
        Node newNode = new Node(value);
        if (head == null && tail == null) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            this.tail.setNext(newNode);
            this.tail = newNode;
        }
        this.size++;
    }

    public void remove(String value) {
        Node previous = null;
        Node actual = this.head;
        for (int i = 0; i < this.size; i++) {
            if (actual.getValue().equalsIgnoreCase(value)) {
                if (actual == head) {
                    this.head = actual.getNext();
                    actual.setNext(null);
                } else if (actual == tail) {
                    this.tail = previous;
                    previous.setNext(null);
                } else {
                    previous.setNext(actual.getNext());
                    actual = null;
                }
                this.size--;
                break;

            } else {
                previous = actual;
                actual = actual.getNext();
            }
        }
    }

    public Node get(int position) {
        Node actual = this.head;
        for (int i = 0; i < position; i++) {
            if (actual.getNext() != null) {
                actual = actual.getNext();
            }
        }
        return actual;
    }
}
