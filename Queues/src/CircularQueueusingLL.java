public class CircularQueueusingLL {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class Queue{
        static Node head=null;
        static Node tail=null;
        public static boolean isEmpty(){
            return head==null && tail==null;
        }
        //isFull()-not in LL because size is not fixed
        public static void add(int data){
            Node newNode=new Node(data);
            if(head==null){
                head=tail=newNode;
                tail.next=head;
                return ;
            }
            tail.next=newNode;
            tail=newNode;
            tail.next=head;
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }
            int front=head.data;
            if(tail==head){
                tail=head=null;
            }else{
                head=head.next;
                tail.next=head;
            }
            return front;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }
            return head.data;
        }
        public static int printRear(){
            if(isEmpty()){
                System.out.println("Empty queue");
                return -1;
            }
            return tail.data;
        }

    }

    public static void main(String[] args) {
        Queue q = new Queue();

        // Test the queue operations
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);

        System.out.println("Front element: " + q.peek());
        System.out.println("Rear element: " + q.printRear());

        System.out.println("Removed: " + q.remove());
        System.out.println("Removed: " + q.remove());

        System.out.println("Front element: " + q.peek());
        System.out.println("Rear element: " + q.printRear());

        q.add(50);

        System.out.println("Front element: " + q.peek());
        System.out.println("Rear element: " + q.printRear());

    }
}
