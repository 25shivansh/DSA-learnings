import java.util.Scanner;

public class saerchinsortedarray {
    static boolean staircasesearch(int matrix[][],int key){//T(c)=O(n+m)
        int row=0,col=matrix[0].length-1;
        while(row<matrix.length && col>=0){
            if(matrix[row][col]==key){
                System.out.println("FOUND AT ("+(row+1)+","+(col+1)+")");
                return true;
            }else if(key<matrix[row][col]){
                col--;
            }else{
                row++;
            }
        }
        System.out.println("KEY NOT FOUND");
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int matrix[][]={{10,20,30,40},
                        {15,25,35,45},
                        {27,29,37,48},
                        {32,33,39,50}};
        //int key=33;
        staircasesearch(matrix,3);
    }
}
