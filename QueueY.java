public class QueueY {

    static class Queue{
        static int arr[];
        static int size;
        static int rear = -1;
        static int front =-1;

        Queue(int n){
            arr = new int[n];
            this.size = n;
        }
        public static boolean isEmpty(){
            return rear ==-1 && front ==-1;
        }

        //full
        public static boolean isFull(){
            return (rear+1)%size == front;
        }

        //Add function(enqueue)
        public static void add(int data){
            if(rear == size-1){
                System.out.println("Full Queue");
                return;
            }
            //1st element add
            if(front == -1){
                front=0;
            }
            rear = (rear+1) % size;
            arr[rear] = data;
        }
        //Remove function(dequeue)
        public static int remove(){
            if(isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }
            int result = arr[front];
            if(rear == front){
                rear = front = -1;
            }else{
                front = (front+1) % size;
            }
            rear--;
            return result;
        }
        //peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        System.out.println(q.remove());
        q.add(6);
        System.out.println(q.remove());
        q.add(7);
        while (!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
