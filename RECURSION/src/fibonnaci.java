import java.util.Scanner;

public class fibonnaci {
    static int printfibonnaci(int n){//T(c)==O(2**n)
        //BASE CASE
        if(n==0||n==1) return n;
        return printfibonnaci(n-1)+printfibonnaci(n-2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER NUMBER:");
        int n=sc.nextInt();
        System.out.println(printfibonnaci(n));
    }
}
