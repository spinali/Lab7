import java.util.Arrays;

public class ThirdTask {
    public static void main(String[] args) {
        int n1 = 4;
        int n2 = 5;

        System.out.println("n = " + n1 + ": " + Arrays.toString(generateZeroArray(n1)));
        System.out.println("n = " + n2 + ": " + Arrays.toString(generateZeroArray(n2)));
    }
    public static int[] generateZeroArray(int n) {
        int[] result = new int[n];
        for (int i = 0; i < n/2; i++) {
            result[i] = i + 1;
            result[n-1-i]=-(i+1);
        }
        if (n%2!=0){
            result[n/2] = 0;
        }
        return result;
    }
}
