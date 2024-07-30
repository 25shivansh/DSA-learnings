import java.util.*;
public class anagrams {
    static void checkstring(String str,String str1){
        //CONVERT STRINGS TO LOWER-CASE
         str=str.toLowerCase();
         str1=str1.toLowerCase();
         //FIRST CHECK IF THE LENGTH IS SAME FOR BOTH THE STRINGS
        if(str.length()==str1.length()){
            //CONVERT STRINGS INTO CHAR ARRAY
            char[]strchararray=str.toCharArray();
            char[]str1chararray=str1.toCharArray();
            //SORT THE CHAR ARRAY
            Arrays.sort(strchararray);
            Arrays.sort(str1chararray);
            //IF THE SORTED CHAR ARRAYS ARE SAME OR IDENTICAL THEN THE STRINGS ARE SAME
            boolean result=Arrays.equals(strchararray,str1chararray);
            if(result){
                System.out.println("ANARGAM");
            }else{
                System.out.println("NOT ANARGAM");
            }
        }else {
            System.out.println("LENGTH ARE NOT EQUAL SO THEY ARE NOT ANARGAM");
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("STRING1:");
        String str=sc.next();
        System.out.println("STRING2:");
        String str1=sc.next();
        checkstring(str,str1);
    }
}
