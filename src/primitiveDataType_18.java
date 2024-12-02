public class primitiveDataType_18 {
    public static  void main(String[]args) {

int SecondNumber = Integer.MAX_VALUE;
int Thirdnumber = Integer.MIN_VALUE;

        System.out.print(" the maximum value of integer : ");
        System.out.println(SecondNumber);

        System.out.println("the minimum value of integer : " + Thirdnumber);

        System.out.println(" -1 from  minimum value  : " +(Thirdnumber -1)); // if we -1 from minimum value the result equal to maximum value.
        System.out.println(" +1 from  minimum value  : " +(Thirdnumber +1)); // that happend opposite.
        System.out.println("Integer value range (" + SecondNumber +" to "+Thirdnumber +")");
    }
}
