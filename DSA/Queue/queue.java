class MyQueue {
    int[] arr;
    int capacity;
    int front, rear, size;

    public MyQueue(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public void enqueue(int x) {
        if (isFull()) {
            System.out.println("Queue is full!");
            return;
        }

        rear = (rear + 1) % capacity;
        arr[rear] = x;
        size++;
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }

        front = (front + 1) % capacity;
        size--;
    }

    public int getFront() {
        if (isEmpty()) return -1;
        return arr[front];
    }

    public int getRear() {
        if (isEmpty()) return -1;
        return arr[rear];
    }
}

public class queue {
    public static void main(String[] args) {

        MyQueue q = new MyQueue(3);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println(q.getFront()); // 10

        // q.dequeue();

        System.out.println(q.getFront()); // 20

        q.enqueue(40);

        System.out.println(q.getRear()); // 40
    }
}