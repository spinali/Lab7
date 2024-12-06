public class FifthTask {
    public static void main(String[] args) {
        System.out.println(repFirstChar("Test")); // Output: "upper"
        System.out.println(repFirstChar("test")); // Output: "lower"
        System.out.println(repFirstChar("1234")); // Output: "digit"
        System.out.println(repFirstChar("@test")); // Output: "other"
    }
    public static String repFirstChar(String s){

            char c = s.charAt(0);

            if (Character.isUpperCase(c)) {
                return "upper";
            } else if (Character.isLowerCase(c)) {
                return "lower";
            } else if (Character.isDigit(c)) {
                return "digit";
            } else {
                return "other";
            }
        }
    }
