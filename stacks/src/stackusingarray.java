import java.util.Stack;

public class stackusingarray {
    public static class Stack{
        int []arr=new int [5];
        int idx=0;
        void push(int x){
            arr[idx]=x;
            idx++;
        }
        int peek(){
            if(idx==0){
                System.out.println("Stack is empty");
                return -1;
            }
            return arr[idx-1];
        }
        int pop(){
            if(idx==0){
                System.out.println("Stack is empty");
                return -1;
            }
            int top=arr[idx-1];
            arr[idx-1]=0;
            idx--;
            return top;

        }
        boolean isEmpty(){
            return idx==0;
        }
        boolean isFull(){
            return (idx==arr.length);
        }
        void display(){
            for(int i=0;i<=idx-1;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Stack st=new Stack();

        st.push(5);
        st.push(4);
        st.push(3);
        st.push(2);
        st.push(1);
        System.out.println(st.isFull());
        System.out.println(st.isEmpty());
        st.display();
        st.pop();
        st.display();
        System.out.println(st.peek());






    }
}
