import java.util.Scanner;
public class question1 {
    static boolean occurence(int num[]){
        int n=num.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(num[i]==num[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF AN ARRAY:");
        int n =sc.nextInt();
        int num[]=new int[n];

        //System.out.println("ENTER ARRAY=");
        for(int i=0;i<n;i++){
            int c=i+1;
            System.out.println("ENTER "+ c +" ELEMENT:" );
            num[i]=sc.nextInt();
        }
        System.out.println(occurence(num));
    }
}
