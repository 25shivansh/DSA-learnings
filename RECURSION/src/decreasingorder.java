import java.util.Scanner;

public class decreasingorder {
    static int recursiveapproach(int n){
        //BASE CASE
        if(n==0||n==1){
            return n;
        }
        System.out.print(n+" ");
        //RECURSIVE WORK
        return recursiveapproach(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER NUMBER:");
        int n=sc.nextInt();
        System.out.println(recursiveapproach(n));
    }
}

