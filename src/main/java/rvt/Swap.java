package rvt;
import java.util.Arrays;
import java.util.Scanner;
public class Swap{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numbers = new int [5];
        numbers[0] = 89;
        numbers[1] = 67;
        numbers[2] = 92;
        numbers[3] = 65;
        numbers[4] = 71;
        System.out.println(Arrays.toString(numbers));
        System.out.println("Kurus mums mainīt?:");
        int index = Integer.valueOf(scanner.nextLine());
        int index1 = Integer.valueOf(scanner.nextLine());
        
        int helper = numbers[index];
        numbers[index] = numbers[index1];
        numbers[index1] = helper;
        System.out.println(Arrays.toString(numbers));
    }
}