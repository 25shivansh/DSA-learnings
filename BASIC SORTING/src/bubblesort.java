public class bubblesort {
    static void basicsorting(int arr[]){
        for(int turns=0;turns<arr.length-1;turns++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    //SWAP
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        basicsorting(arr);
        printarr(arr);
    }
}
