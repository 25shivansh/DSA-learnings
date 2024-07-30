public class question2 {
    static void printdupilicate(String str,int idx,StringBuilder newstr , boolean map[]){
        //BASE CASE
        if(idx==str.length()){
            System.out.println(newstr);
            return;
        }
        //kaam
        char currchar=str.charAt(idx);
        if(map[currchar-'a']==true){
           //DUPLICATE
           printdupilicate(str,idx+1,newstr,map);
        }else{
            map[currchar-'a']=true;
            printdupilicate(str,idx+1,newstr.append(currchar),map);
        }

    }
    public static void main(String[] args) {
        String str="appnnacollege";
        printdupilicate(str,0,new StringBuilder(),new boolean[26] );

    }
}
