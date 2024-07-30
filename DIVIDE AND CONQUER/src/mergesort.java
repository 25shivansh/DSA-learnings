import java.util.Scanner;
public class mergesort {
    static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void sortarray(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;//(si+ei)/2
        sortarray(arr,si,mid);
        sortarray(arr,mid+1,ei);
        merge(arr,si,ei,mid);
    }
    static void merge(int arr[],int si,int ei,int mid){
        int temp[]=new int [ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }else {
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        //left part
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        //right part
        while(j<=ei){
            temp[k++]=arr[j++];
        }
        //copy temp in orignal array
        for(k=0,i = si; k<temp.length; k++,i++){
            arr[i]=temp[k];
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF AN ARRAY:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("ENTER "+(i+1)+" ELEMENT");
            arr[i]= sc.nextInt();
        }
        System.out.print("UNSORTED ARRAY: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.print("SORTED ARRAY::");
        sortarray(arr,0,arr.length-1);
        printarr(arr);
    }
}
