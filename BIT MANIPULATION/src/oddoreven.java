public class oddoreven {
    static void oddoreven(int n){
        int bitmask=1;
        if((n&bitmask)==0){
            //EVEN NUMBER
            System.out.println("EVEN NUMBER");
        }else{
            System.out.println("ODD NUMBER");
        }
    }
    public static void main(String[] args) {
        oddoreven(3);
        oddoreven(11);
        oddoreven(14);
    }
}
