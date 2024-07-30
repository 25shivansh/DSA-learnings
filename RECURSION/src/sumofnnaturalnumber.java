import java.util.Scanner;

public class sumofnnaturalnumber {
    static int sum(int n){//T(c)&space complexity-->O(n)
        //BASE CASE
        if(n==0||n==1)return 1;
        //RECUSRSIVE CASE
        int sum=n+sum(n-1);
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER NUMBER:");
        int n=sc.nextInt();
        System.out.println("sum of first natural numbers:"+sum(n));
    }
}
