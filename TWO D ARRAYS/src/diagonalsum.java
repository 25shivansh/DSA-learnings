import java.util.Scanner;

public class diagonalsum {
    static int diagonalsum(int arr[][]){//T(c)=O(n^2)
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(i==j){
                    sum+=arr[i][j];
                }
                if(i+j==arr.length-1){
                    sum+=arr[i][j];
                }
            }
        }
        return sum;
    }
    static int optimizeddiagonalsum(int arr[][]){//T(c)=O(n)
        int sum=0;
        for(int i=0;i<arr.length;i++){
            //PRIMARY DIAGONAL
            sum+=arr[i][i];
            //SECONDARY DIAGONAL
            if(i !=arr.length-1-i){
                sum+=arr[i][arr.length-i-1];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER NUMBER OF ROWS:");
        int r=sc.nextInt();
        System.out.println("ENTER NUMBER OF COLUMNS:");
        int c=sc.nextInt();
        int arr[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print("ENTER "+(i+1)+(j+1)+" ELEMENTS:");
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("DIAGONAL SUM OF GIVEN MATRIX WITH TIME COMPLEXITY OF O(n^2):"+diagonalsum(arr));
        System.out.println("DIAGONAL SUM WITH LINEAR TIME COMPLEXITY O(n): "+optimizeddiagonalsum(arr));
    }
}
