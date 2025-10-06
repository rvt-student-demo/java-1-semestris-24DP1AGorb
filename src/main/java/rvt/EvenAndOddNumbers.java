package rvt;
import java.util.Scanner;
public class EvenAndOddNumbers{
    public static void main(String[]args){
        int sum = 0;
        int skaits = 0;
        int even = 0;
        int odd = 0;
        Scanner scanner = new Scanner (System.in);
        System.out.println("Give numbers");
        while(true){
            int numbers = Integer.valueOf(scanner.nextLine());
            if (numbers == -1){
                System.out.println("Thx! Bye!");
                
                break;
            }
            if (numbers % 2 == 0){
                even++;
            }
            else{
                odd++;
            }
            sum = sum + numbers;
            skaits++;

        }
        System.out.println("Sum: "+ sum);
        System.out.println("Number" + skaits);
        System.out.println("Avarage: " + (double)sum / skaits);
        System.out.println("Even: " + even);
        System.out.println("Odd:" + odd);
        scanner.close();
    }   
}
