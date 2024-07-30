package linkedlist;
public class basics {
    Node head;
    private int size;
    basics(){
        this.size=0;
    }

    class Node{
        String data;
        Node next;
        Node (String data){
            this.data=data;
            this.next=null;
            size++;

        }
    }
    public void printlist(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Node currnode=head;
        while(currnode!=null){
            System.out.print(currnode.data+" -->");
            currnode=currnode.next;
        }
        System.out.println("null");
    }
    public void addlast(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }
    public void addfirst(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void deletefirst(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        size--;
        head=head.next;
    }
    public void deletelast(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        Node secondlast=head;
        Node lastnode=head.next;
        while(lastnode.next!=null){
            lastnode=lastnode.next;
            secondlast=secondlast.next;
        }
        secondlast.next=null;
    }
    public int getSize(){
        return size;
    }
    public static void main(String[] args){
        basics list=new basics();
        list.addfirst("a");
        list.addfirst("is");
        list.printlist();
        list.addlast("list");
        list.printlist();
        list.addfirst("this");
        list.printlist();
        list.deletefirst();
        list.printlist();
        list.deletelast();
        list.printlist();
        System.out.println(list.getSize());
        list.addfirst("this");
        list.printlist();
        System.out.println(list.getSize());

    }
}