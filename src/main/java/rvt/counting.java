package rvt;
import java.util.Scanner;
public class counting{
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Ievadi skaitli");
        int skaitlis = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i <= skaitlis; i++){
            System.out.println(i);
        }
        scanner.close();
    }
}
