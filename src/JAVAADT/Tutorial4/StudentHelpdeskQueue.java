package JAVAADT.Tutorial4;

/*  @author: Sattaporn Kowarakun
 *           sattaporn_kowarakun@cmu.ac.th
 *           672115046
*/

public class StudentHelpdeskQueue {
    private int front, rear, capacity, qsize;
    private String[] queue;

    public int size(){
        return this.qsize;
    }

    public StudentHelpdeskQueue(int capacity){
        this.capacity = capacity;
        this.front = this.rear = this.qsize = 0;
        this.queue = new String[capacity];
    }

    public boolean isEmpty(){
        return qsize == 0;
    }

    public boolean isFull(){
        return qsize == capacity;
    }

    public void enqueue(String inputName){
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue: " + inputName);
            return;
        }
        queue[rear++] = inputName;
        if (rear == capacity) {
            rear = 0;
        }
        qsize++;
        System.out.println("Enqueue " + inputName);
        displayQueue();
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return;
        }
        System.out.println("Dequeue " + queue[front]);
        queue[front++] = null;
        if (front == capacity) {
            front = 0;
        }
        qsize--;
        displayQueue();
    }

    public void displayQueue() {
        System.out.print("[");
        for (int i=0; i<capacity; i++) {
            System.out.print(queue[i]);
            if (i<capacity-1) {
                System.out.print(", ");
            }
        }
        System.out.println("] [first = " + front + ", rear = " + rear + ", length = " + qsize + "]");
    }
}
