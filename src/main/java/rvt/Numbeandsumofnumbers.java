package rvt;
import java.util.Scanner;
public class Numbeandsumofnumbers{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int summa = 0;
        int skaits = 0;
        while (true){
            System.out.println("Give a number");
            int num = Integer.valueOf(scanner.nextLine());
            
            if (num == 0){
                System.out.println("Numbers of numbers: "+ skaits);
                System.out.println("Sum of the numbers:"+ summa);
                break;
            }
            summa = summa + num;
            skaits = skaits + 1;
        }                              
            

    }
}
