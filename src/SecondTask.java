public class SecondTask {
    public static void main(String[] args) {
        System.out.println("The sum of the numbers in the array is: "
                + calcSumArray (new int[]{0, 1, 2, 3, 4}));
    }
    public static int calcSumArray(int[] arr){
        int result = 0;
        //the issue was that the loop has been starting from 1 (i=1) - did not included the first element of the array (arr[0])
        for (int i=0; i < arr.length; i++){
            result += arr[i];
        }
        return result;
    }
}
