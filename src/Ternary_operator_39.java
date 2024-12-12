public class Ternary_operator_39 {
    public  static  void  main(String[]args){
        //ternary operation
        // operand1? operand2 : operand3
        String car = "bmw";
        boolean ans = car =="bmw" ? true : false;
        if (ans){
            System.out.println(" this is bmw ");
        }

        int age = 45;
        String line =age<=18?"under eighteen" : "over eighteen";
        System.out.println("he is "+ line);
    }
}
