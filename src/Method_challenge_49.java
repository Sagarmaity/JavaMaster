public class Method_challenge_49 {
    public static void main(String[] args) {
        int highscoreposition = calculateHighScorePosition(1500);
        displayHighScorePosition("debuuger",highscoreposition);
         highscoreposition = calculateHighScorePosition(1000);
        displayHighScorePosition("debu",highscoreposition);
         highscoreposition = calculateHighScorePosition(500);
        displayHighScorePosition("debuuger team",highscoreposition);
         highscoreposition = calculateHighScorePosition(40);
        displayHighScorePosition("tindal",highscoreposition);


    }




    public static void displayHighScorePosition(String name,int highscoreposition){
        System.out.println(name+" managed to get into position "+highscoreposition+" on the high score list" );
    }
        public static int calculateHighScorePosition(int playerScore){
       if (playerScore>= 1000){
    return 1;
       } else if (playerScore>=500 && playerScore<1000) {
           return 2;
       } else if (playerScore>=100 && playerScore<500) {
           return 3;

       }else {
           return 4;

       }

}
}
