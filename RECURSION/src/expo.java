import java.util.Scanner;

public class expo {
    static int power(int x,int n){
        if(n==0){
            return 1;
        }
        return x*power(x,n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER NUMBER:" );
        int x=sc.nextInt();
        System.out.println("ENTER NUMBER TO BE RAISED AS POWER: ");
        int n=sc.nextInt();
        System.out.println(power(x,n));
    }
}
