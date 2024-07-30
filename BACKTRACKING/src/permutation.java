import java.util.Scanner;

public class permutation {
    static void findpermutation(String str,String ans){
        //base case
        if(str.length()==0){
            System.out.println(ans);
            return;
        }

        //recursion
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            //"abcde"="ab"+"de"
            String Newstr=str.substring(0,i) +str.substring(i+1);
            findpermutation(Newstr,ans+curr);
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE STRING:");
        String str=sc.next();
        findpermutation(str,"");
    }
}
