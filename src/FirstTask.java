import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        System.out.println("Put a number");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                sb.append("-");
            }else{
                sb.append("+");
            }
        }
        System.out.println(sb);
    }
}
