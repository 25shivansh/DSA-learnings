import java.util.*;
public class question1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER STRING:");
        String str=sc.next();
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a' || ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
        }
        System.out.println("TOTAL NUMBER OF VOWELS:"+count);

    }
}
