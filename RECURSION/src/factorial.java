import java.util.Scanner;

public class factorial {
    static int printfactorial(int n){//TIME COMPLEXITY--->O(n)
        //BASE CASE
        if(n==0||n==1){
            return 1;
        }
        //RECURSIVE WORK
        int fact=n*printfactorial(n-1);
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER NUMBER:");
        int n=sc.nextInt();
        System.out.println(printfactorial(n));
        //SPACE COMPLEXITY-->O(n)
    }
}
