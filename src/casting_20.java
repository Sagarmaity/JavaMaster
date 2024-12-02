public class casting_20 {
    public static  void  main(String[]args){
        int firsInt = Integer.MAX_VALUE;

        float myfloatvalue =  865.86f;
        int myvalue = (int) myfloatvalue;

        System.out.println("before casting value is " + myfloatvalue);
        System.out.println("after casting value is "+myvalue);

        System.out.println("________________________________________________");
        int myintvalue = 566;
        float myfvalue = (float)myintvalue;
        System.out.println("before casting value is " + myintvalue);
        System.out.println("after casting value is "+myfvalue);
        System.out.println("________________________________________________");

//casting from char to int
        char firstchar = 'g';
        int scnumber = (char)firstchar;
        System.out.println("before casting value is " + firstchar);
        System.out.println("after casting value is "+scnumber);


    }

}
