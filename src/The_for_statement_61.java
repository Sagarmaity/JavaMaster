public class The_for_statement_61 {
    public static void main(String[] args) {
        for (int i = 1; i <=5 ; i++) {
            System.out.println(i);
        }

        for (double rate=2.0 ; rate <= 6; rate++){
            double interestamount = calculaateInterest(10000.0,rate);
            System.out.println("10000 at "+ rate+" % interest " + interestamount);
        }
for (double i =7.5; i<=10; i+=0.25){
    double interestamount = calculaateInterest(1000.0,i);
    if (i> 8.5){
        break;
    }
    System.out.println("$1000 at "+ i+" % interest " + interestamount);
}


    }
    public static  double calculaateInterest(double amount, double interest ){
        return (amount*(interest/100));
    }
}
