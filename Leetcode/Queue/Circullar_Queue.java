
class Circullar_Queue {

    int arr[];
    int front, rear, capacity;

    public Circullar_Queue(int capacity) {

        this.capacity = capacity;
        arr = new int[capacity];
        front = -1;
        rear = -1;
    }

    public void enqueue(int data) {
        if ((rear + 1) % capacity == front) {
            System.out.println("Queue Full");
            return;
        }
        if (front == -1) {
            front = 0;
        }
        rear = (rear + 1) % capacity;
        arr[rear] = data;
    }

    public int dequeue() {
        if (front == -1 && rear == -1) {
            System.out.println("Queue Empty");
            return -1;
        }

        int data = arr[front];
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % capacity;
        }
        return data;
    }

}
