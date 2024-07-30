public class interfaces {
    public static void main(String[] args) {
        queen q=new queen();
        q.moves();

    }
}
interface herbivore{

}
interface carnivore{

}
class bear implements herbivore,carnivore{
    // EXAMPLE OF HOW MULTIPLE INHERITENCE IS IMPELEMENTED USING INTERFACES.
}
interface chessplayer{
    void moves();
}
class queen implements chessplayer {
    public void moves(){
        System.out.println("UP,DOWN,RIGHT,LEFT,DIAGONAL(IN ALL 4 DIRECTIONS");
    }
}
class rook implements chessplayer{
    public void moves(){
        System.out.println("up,down,left,right");
    }
}
class king implements chessplayer{
    public void moves(){
        System.out.println("up,down,right,left,diagonal by one step");
    }
}
