public class subsets {
    static void findsubsets(String str,String ans,int i){
        //BASE CASE
        if(i==str.length()){
            System.out.println(ans);
            return;
        }

        //RECURSION
        //YES choice
        findsubsets(str,ans+str.charAt(i),i+1);
        //NO choice
        findsubsets(str,ans,i+1);


    }

    public static void main(String[] args) {
        String str="abc";
        findsubsets(str,"",0);
    }
}
