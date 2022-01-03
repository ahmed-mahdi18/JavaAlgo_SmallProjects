public class Main {
    public static void main(String[] args) {
        Integer five = 5;
        Integer ten = 10;
        Integer two = 2;
        Integer twentyFive = 25;

        IntegerLinkedList list = new IntegerLinkedList();
        list.insertSorted(ten);
        list.printList();
        list.insertSorted(two);
        list.printList();
        list.insertSorted(twentyFive);
        list.printList();
        list.insertSorted(five);
        list.printList();
   }
}
