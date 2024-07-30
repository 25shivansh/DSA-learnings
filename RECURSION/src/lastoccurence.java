import java.util.Scanner;


public class lastoccurence {
    static int returnlastoccurence(int arr[],int key,int i){
        //BASE CASE
        if(i==arr.length){
            return -1;
        }
        int isfound=returnlastoccurence(arr,key,i+1);
        if(isfound==-1&&arr[i]==key){
            return i;
        }
        return isfound;


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER SIZE OF AN ARRAY:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("ENTER "+(i+1)+" ELEMENT");
            arr[i]=sc.nextInt();
        }
        System.out.println("ENTER THE KEY VALUE:");
        int key=sc.nextInt();
        System.out.println(returnlastoccurence(arr,key,0));


    }
}
