import java.util.Scanner;

public class increasingorder {
    static void recursiveincreasingapproach(int n){
        //BASE CASE
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        //RECURSIVE CASE
        recursiveincreasingapproach(n-1);
        System.out.print(n+" ");

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER NUMBER:");
        int n=sc.nextInt();
        recursiveincreasingapproach(n);
    }
}
