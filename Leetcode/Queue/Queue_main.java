
class Queue_main {

    int[] array;
    int front, rear;
    int capacity;

    Queue_main(int capacity) {
        this.capacity = capacity;
        array = new int[capacity];
        front = -1;
        rear = -1;
    }

    public void enqueue(int data) {
        if (rear == capacity - 1) {
            System.out.println("Queue Full");
            return;
        }
        if (front == -1) {
            front = 0;
        }
        array[++rear] = data;
    }

    public int dequeue() {
        if (front == -1 && rear == -1) {
            System.out.println("Queue Empty");
            return -1;
        }
        int data = array[front];
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front++;
        }
        return data;
    }

    public int peek() {
        if (front == -1 && rear == -1) {
            System.out.println("Queue Empty");
            return -1;
        }
        return array[front];
    }

    public boolean isEmpty() {
        return front == -1 && rear == -1;
    }

}
