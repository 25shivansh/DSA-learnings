import java.util.Scanner;
public class question2 {
    static int indexoftarget(int nums[],int target){
        //TIME COMPLEXITY=O(n)
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==target){
                return i;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF AN ARRAY:");
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            int c=i+1;
            System.out.println("ENTER "+c+" ELEMENT:");
            nums[i]=sc.nextInt();
        }
        System.out.println("ENTER THE TARGET VALUE:");
        int target=sc.nextInt();
        System.out.println(indexoftarget(nums,target));
    }
}
