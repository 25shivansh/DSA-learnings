public class QueueuUsingArray {
    static class Queue{
        static int arr[];
        static int size;
        static int rear;
        Queue(int n){
            arr=new int[n];
            size=n;
            rear=-1;
        }
        public static boolean isEmpty(){
            return rear==-1;
        }
        public static boolean isFull(){
            return rear==size-1;
        }
        public static int size(){
            System.out.print("SIZE OF QUEUE:- ");
            return rear +1;

        }
        public static int printRear(){
            System.out.print("Rear element:- ");
            return arr[rear];
        }
        public static void add(int data){
            if(isFull()){
                System.out.println("Queue is Full");
                return ;
            }
            rear=rear+1;
            arr[rear]=data;
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            int front=arr[0];
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            rear=rear-1;
            return front;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }
            return arr[0];
        }

    }



    public static void main(String[] args) {
        Queue q=new Queue(5);
        q.add(1);
        q.add(2);
        q.add(4);
        System.out.println(q.isEmpty());
        System.out.println(q.isFull());
        System.out.println(q.size());
        System.out.println(q.printRear());
        while(!q.isEmpty()){
            System.out.print(q.peek()+" ");
            q.remove();
        }
        System.out.println();

    }
}
