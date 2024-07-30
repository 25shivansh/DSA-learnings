import java.util.Scanner;

public class sortedarray {
    static boolean printsorted(int arr[],int i){
        //BASE CASE
        if(i==arr.length-1){
            return true;
        }
        //RECURSIVE CASE
        if(arr[i]>arr[i+1]){
            return false;
        }
        return printsorted(arr,i+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF AN ARRAY:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("ENTER "+(i+1)+" ELEMENT:");
            arr[i]=sc.nextInt();
        }
        System.out.println(printsorted(arr,0));

    }
}
