package rvt;
import java.util.Scanner;

public class age {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("age:");
        int age = Integer.valueOf (scanner.nextLine());
        if (age > 18){
            System.out.println("Tu esi pilngadīgs");
        }
        scanner.close();
    }
}
