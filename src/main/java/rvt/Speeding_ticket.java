package rvt;
import java.util.Scanner;

public class Speeding_ticket{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadi atrumu:");
        int atrums = Integer.valueOf (scanner.nextLine());
        if (atrums > 120){
            System.out.println("Jums pienakas sods! Paradiet man savus dokumentus!");
        }
        else{
            System.out.println("Atvainojiet");
        }
        scanner.close();
    }   


    }

