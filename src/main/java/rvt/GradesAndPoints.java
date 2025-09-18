package rvt;
import java.util.Scanner;

public class GradesAndPoints{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadi savu atzimi:");
        int atzime = Integer.valueOf (scanner.nextLine());
        if (atzime < 0){
            System.out.println("Impossible!");
    }   else if (atzime < 50 ){
            System.out.println("Failed!");       
    }   else if (atzime < 60){
            System.out.println("atzime ir 1!");
    }   else if (atzime < 70){
            System.out.println("atzime ir 2!");
    }   else if (atzime < 80){
            System.out.println("atzime ir 3!");
    }   else if (atzime < 90){
            System.out.println("atzime ir 4!");
    }   else if (atzime < 100){
            System.out.println("atzime ir 5!");
    }   else if (atzime > 100){
            System.out.println("Iesapidigi!");
    }
        scanner.close();
    }
        
    }

