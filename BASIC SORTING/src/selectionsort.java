public class selectionsort {
    static void sorting(int nums[]){
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            int minPos=i;
            for(int j=i+1;j<n;j++){
                if(nums[minPos]<nums[j]){// > < decides the ascending or desacending order
                    minPos=j;
                }
            }
            //SWAP
            int temp=nums[minPos];
            nums[minPos]=nums[i];
            nums[i]=temp;
        }
    }
    static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6,7,8,9};
        sorting(nums);
        printarr(nums);

    }//TIME COMPLEXITY= O(n^2)
}
