public class operator_Challenge_40 {
    public  static  void  main(String[]args){
        double myFirstValue = 20.00d;
        double mySecondValue = 80.00d;
        double mytoalValue = myFirstValue+mySecondValue* 100.00d;
        System.out.println("my total value = "+ mytoalValue);
double theRemainder = mytoalValue % 40.00d;
        System.out.println("the remainder is "+ theRemainder);
        boolean isnoRemainder = (theRemainder==0)? true: false;
        System.out.println(" is no remainder ="+ isnoRemainder);
        if (!isnoRemainder){
            System.out.println("got some remainder");
        }
    }

}
