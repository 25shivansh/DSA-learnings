/*QUESTION:- Given a friends each one can remain single or can be paired up with some other friend. Each
friend can be paired only once . Find out the total number of ways in which friends can
remain single or can be paired up.
 */
public class question3 {
    static int friendspairing(int n){
        if(n==1||n==2){
            return n;
        }
       //CHOICE
       //SINGLE
       int fnm1=friendspairing(n-1);

       //PAIR
        int fnm2=friendspairing(n-2);
        int pairways=(n-1)*fnm2;

        //Totalways
        int totalways=fnm1+pairways;
        return totalways;
    }
    public static void main(String[] args) {
        System.out.println(friendspairing(3));


    }
}
