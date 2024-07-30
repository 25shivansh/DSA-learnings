public class selectionmethod {
    static void selectionsort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int minpos=i;
            for(int j=i+1;j<n;j++){
                if(arr[minpos]<arr[j]){
                    minpos=j;
                }
            }
            //SWAP
            int temp=arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;
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
        selectionsort(arr);
        printarray(arr);
    }
}
