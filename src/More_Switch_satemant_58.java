public class More_Switch_satemant_58 {
    public static void main(String[] args) {
        int switchValue = 6;

        switch (switchValue) {
            case 1 -> System.out.println("this is one");
            case 2 -> System.out.println("this is two");
            case 3 -> System.out.println("this is three");
            case 4, 6, 7 -> {
                System.out.println("this are four six and seven");
                System.out.println(" actually this is four");
            }
            case 5 -> System.out.println("this is five");
            default -> System.out.println("was  not 1 to 5");
        }
        String month = "MARCH";
        System.out.println(month+" is in the "+ getQuater(month)+" quater");
    }
    public static String getQuater(String month){


      /*  switch (month){
            case "JANUARY":
                return "1st";
            case "FEBRUARY":
                return "2nd";
            case "MARCH":

                return  "3rd";
        }
        return "bad";    */
       return switch (month) {
            case "JANUARY" -> "1st";
            case "FEBRUARY" -> "2nd";

            case "MARCH" ->"3rd";

            default -> {
                String badres = month+ "is bad";
                yield badres;
            }

        };



    }





}