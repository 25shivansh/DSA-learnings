import java.util.Scanner;

public class nqueeens {
    static void nQueens(char board[][],int row){
        //BASE
        if(row==board.length){
            printBoard(board);
            return;

        }
        //COLUMN LOOPS
        for(int j=0;j<board.length;j++){
            board[row][j]='Q';
            nQueens(board,row+1);//function call
            board[row][j]='X';//backtracking step
        }
    }
    static void printBoard(char board[][]){
        System.out.println("-------CHESS BOARD--------");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER:");
        int n=sc.nextInt();
        char board[][]=new char[n][n];
        //initialize
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='X';
            }
        }
        nQueens(board,0);
    }
}
