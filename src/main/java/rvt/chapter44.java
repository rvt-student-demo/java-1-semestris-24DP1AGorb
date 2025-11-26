package rvt;
import java.util.Scanner;
public class chapter44{
    public static void main(String [] args){
        ex1();
    }
    public static void ex1(){
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter your name:");
       String fullName = scanner.nextLine();
       fullName = fullName.trim();
       String[] nameParts = fullName.split(" ");

       String firstName = nameParts[0];
       String lastName = nameParts[1].toUpperCase();
        System.out.println(firstName + " " + lastName);

}
    
}