public class If_Else_44 {
    public static void main(String[]args){
        boolean gameover = true;
        int score = 4000;
        int levelcompleted = 5;
        int bonus = 100;
     /*   if (score <= 5000){ //code in block will execute only if first condition is true
            System.out.println("your score was less then or equal 5000");
        } else { // code in block will execute only if condition is false.
            System.out.println("got here");
        }  */
      if (score < 5000 && score>1000) {
          System.out.println("your score was less than 5000 but greater than 1000");
      } else if (score<1000) {
          System.out.println("your score was less than 1000");
      }
      else {
          System.out.println("got here");
      }
    }
}
