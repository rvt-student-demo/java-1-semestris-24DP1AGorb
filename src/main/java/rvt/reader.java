package rvt;
import java.util.Scanner;

public class reader{
    private static Scanner scanner;

    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        System.out.println("Emter the first string");
        String first = reader.nextLine();
        System.out.println("Enter your second string");
        String second = reader.nextLine();
        if (first == second){
            System.out.println("The strings are the same");
    }   else{
            System.out.println("The strings are NOT the same");
    }
        scanner.close();
}  

}