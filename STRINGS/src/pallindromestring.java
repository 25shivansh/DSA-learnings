import java.util.*;
public class pallindromestring {
    static void checkpallindrome(String str){//T(c)=O(n)------LINEAR TIME COMPLEXITY
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==str.charAt(str.length()-1-i)){
                System.out.println("PALLINDROME");
                break;
            }else{
                System.out.println("NOT PALLINDROME");
                break;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER YOUR STRING:");
        String str=sc.next();
        checkpallindrome(str);

    }
}
