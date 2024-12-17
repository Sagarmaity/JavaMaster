public class Method_recap_48 {
    public static void main(String[]args){
        boolean b =isTooyung(78);
        System.out.println(" age is "+b);

        boolean c =isTooyung(8);
        System.out.println(" age is "+c);
    }
    public static boolean isTooyung(int age){
        if(age<21){
           return true;

        }
        return false;

    }

    public static boolean isTooyungs(int age){
        boolean result = false;
        if(age<18){
            result= true;

        }
        return result;

    }


}
