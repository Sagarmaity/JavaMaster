public class The_Switch_Statement_57 {
    public static void main(String[] args) {
int switchValue =6;

switch (switchValue){
    case 1:
        System.out.println("this is one");
        break;
    case 2:
        System.out.println("this is two");
        break;
    case 3:
        System.out.println("this is three");
        break;
    case 4: case 6: case 7:
        System.out.println("this are four six and seven");
        System.out.println(" actually this is four");
        break;
    case 5:
        System.out.println("this is five");
        break;
    default:
        System.out.println("was  not 1 to 5");
        break;


}



    }
}
