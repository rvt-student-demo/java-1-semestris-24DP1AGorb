package rvt;
import java.util.Scanner;

public class skaitam {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadi pirmo skaitli:");
        int pirmais = Integer.valueOf(scanner.nextLine());
        System.out.println("Ievadi otro skaitli:");
        int otrais = Integer.valueOf(scanner.nextLine());
        int result = pirmais + otrais;
        System.out.println("Rezultats ir " + result);
        scanner.close();


    }

}