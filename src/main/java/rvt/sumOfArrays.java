package rvt;
public class sumOfArrays{
    public static void main(String[] args) {
        int sum = 0;
        int[] numbers = {3, 21, 4, 21, 76};

        for (int i = 0; i < numbers.length; i++){
            sum = sum + numbers[i];
        }
        System.err.println(sum);
    }
}