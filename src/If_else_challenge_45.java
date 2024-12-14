public class If_else_challenge_45 {
    public static void main(String[]args){
        boolean gameover = true;
        int score = 800;
        int levelcompleted = 5;
        int bonus = 100;


        int finalScore = score;
        if (gameover){
            finalScore += (levelcompleted*bonus);
            System.out.println("your final score was "+ finalScore);

        }
        boolean newgameover = true;
        int newscore = 10000;
        int newlevelcompleted = 8;
        int newbonus = 200;


        int newfinalScore = newscore;
        if (newgameover){
            newfinalScore += (newlevelcompleted*newbonus);
            System.out.println("your final score was "+ newfinalScore);

        }
    }
}
