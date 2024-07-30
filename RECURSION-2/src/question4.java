/*
PRINT ALL BINARY STRINGS OF SIZE N WITHOUT CONSECUTIVE ONES.
 */
public class question4 {
    static void binarystring(int n,int lastplace,String str){
        //base case
        if(n==0){
            System.out.println(str);
            return;
        }
        //kaam
        binarystring(n-1,0,str+"0");
        if(lastplace==0){
            binarystring(n-1,1,str+"1");
        }
    }
    public static void main(String[] args) {
        binarystring(3,0,"");

    }
}
