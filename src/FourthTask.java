import java.util.Arrays;

public class FourthTask {
    public static void main(String[] args) {
        System.out.println(findTheLargest(213));
        System.out.println(findTheLargest(553));
    }
    public static int findTheLargest(int n){
        char[] digits = String.valueOf(n).toCharArray();
        Arrays.sort(digits);
        StringBuilder sb = new StringBuilder(new String(digits)).reverse();
        return Integer.parseInt(sb.toString());
    }
}
