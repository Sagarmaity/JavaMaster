public class More_on_Method_47 {
    public static void main(String[] args) {

        boolean gameover = true;
        int score = 800;
        int levelcompleted = 5;
        int bonus = 100;

        int highscore = calculators(true, 400,3,100);
        System.out.println("the high score is "+highscore);
        calculator(gameover,score,levelcompleted,bonus);
        calculator(true, 400,3,100);
    }

    public static void calculator(boolean gameover, int score, int levelcompleted, int bonus) {


        int finalScore = score;
        if (gameover) {
            finalScore += (levelcompleted * bonus);
            System.out.println("your final score was " + finalScore);

        }
    }


    public static int calculators(boolean gameover, int score, int levelcompleted, int bonus) {
        int finalScore = score;
        if (gameover) {
            finalScore += (levelcompleted * bonus);
        }
        return finalScore;
    }
}
