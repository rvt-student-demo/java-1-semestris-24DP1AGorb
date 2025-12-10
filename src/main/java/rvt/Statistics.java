package rvt;
import java.util.Scanner;

public class Statistics {
    private int count;
    private int sum;  
    private float average;


    public Statistics() {
        count = 0;
        sum = 0;
    }

    public void addNumber(int number) {
        count++;
        sum = sum + number;
        average = sum / count;
    }
    
    public int sum(){
        return sum;

    }

    public int getCount() {
        return count;
    }

    public float getAverage() { 
       return average;
    }



    public static void main(String[] args) {
        Statistics statistics = new Statistics();
        
        //statistics.addNumber(3);
        //statistics.addNumber(5);
        //statistics.addNumber(1);
        //statistics.addNumber(2);
    Scanner scanner = new Scanner(System.in);
    int count = scanner.nextInt();
    int []statisticss = new int[count];
    for(int i = 0; i<count;i++){
        statisticss[i] = scanner.nextInt();
    }



        System.out.println("Count: " + statistics.getCount());
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Average:" + statistics.getAverage());
    }
}
    
    
