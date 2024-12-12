public class Floating_point_precision_23 {
    public static void main(String []args){
        int myivalue = 5;
        float myfvalue = 5f;
        double mydvalue = 5d;
         myivalue = 5/3;
        System.out.println(myivalue);
        myfvalue =5f/3f;
        System.out.println(myfvalue);

        mydvalue = 5d/3d;
        System.out.println(mydvalue);



        float pound = 200f;
        double kilogram = (double)pound*0.45359237d;
        System.out.println(pound + " = "+ kilogram);
    }
}
