import java.util.Scanner;

public class firstoccurence {
    static int returnindex(int arr[],int a,int i){
        //BASE CASE
        if(i==arr.length){
            return -1;
        }
        //SELF WORK
        if(arr[i]==a){
            return i;
        }
        //RECURSIVE WORK
        return returnindex(arr,a,i+1);

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
        System.out.println("ENTER ELEMENT TO BE SEARCHED:");
        int a=sc.nextInt();
        System.out.println(returnindex(arr,a,0));
    }
}
