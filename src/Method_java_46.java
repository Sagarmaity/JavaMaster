public class Method_java_46 {
    public static void main(String[]args){
calculator(true,5000,5,3);
    }
public static  void  calculator( boolean gameover, int score, int levelcompleted ,int bonus){
    /*boolean gameover = true;
    int score = 800;
    int levelcompleted = 5;
    int bonus = 100; */


    int finalScore = score;
    if (gameover){
        finalScore += (levelcompleted*bonus);
        System.out.println("your final score was "+ finalScore);

    }
}


}
