import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {

        // priority queue testing
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        pq.add(25);
        pq.add(-22);
        pq.add(1345);
        pq.add(54);
        pq.add(0);
        pq.add(-3467);
        pq.add(428);
        System.out.println(pq.peek());
        System.out.println(pq.remove());
        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq.remove(54));

        Object[] ints = pq.toArray();
        for(Object num : ints){
            System.out.println(num);
        }


        System.out.println(pq.peek());
        pq.add(-1);
        System.out.println(pq.peek());



        // Heaps start here
        Heap heap = new Heap(10);

        heap.insert(80);
        heap.insert(75);
        heap.insert(60);
        heap.insert(68);
        heap.insert(55);
        heap.insert(40);
        heap.insert(52);
        heap.insert(67);

        heap.printHeap();
        System.out.println(heap.peek());

        heap.delete(0);
        heap.printHeap();
        System.out.println(heap.peek());

        heap.sort();
        heap.printHeap();

    }
}
