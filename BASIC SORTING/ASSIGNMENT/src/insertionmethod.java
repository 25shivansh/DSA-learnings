public class insertionmethod {
    static void insertionsort(int arr[]){
        int n= arr.length;
        for(int i=1;i<n;i++){
            int curr=arr[i];
            int prev=i-1;
            while(prev>=0&&arr[prev]<curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            //INSERTION
            arr[prev+1]=curr;
        }
    }
    static void printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={3,6,2,1,8,7,4,5,3,1};
        insertionsort(arr);
        printarray(arr);
    }
}
