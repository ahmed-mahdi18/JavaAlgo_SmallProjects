public class IntegerLinkedList {
    private IntegerNode head;
    private int size;

    public void addToFront(Integer value) {
        IntegerNode node = new IntegerNode(value);
        node.setNext(head);
        head = node;
        size++;
    }

    public IntegerNode removeFromFront() {
        if (isEmpty()) {
            return null;
        }

        IntegerNode removedNode = head;
        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    public void insertSorted(Integer value) {

        if (size == 0 || head.getValue() > value) {
            addToFront(value);
        } else {

            IntegerLinkedList tempList = new IntegerLinkedList();
            while (head != null && head.getValue() < value) {
                IntegerNode tempNode = head;
                tempList.addToFront(tempNode.getValue());
                this.removeFromFront();
            }
            this.addToFront(value);
            while(!tempList.isEmpty()) {
                this.addToFront(tempList.head.getValue());
                tempList.removeFromFront();
            }
        }
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void printList() {
        IntegerNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

}
