package rvt;
import java.util.Arrays;
import java.util.Scanner;
public class Masivi{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int x = 1;

        // 0, 1, 2, 3, 4
        int[] data = new int[5];
        System.out.println(data.length);
        data[0]= 20;
        data[1] =  20 + 3;      
        data[2] = x;
        data[3]= 4;
        data[4] =5;
        System.out.println(Arrays.toString(data));
        String name = "ABC";
        name.toLowerCase();
        System.out.println(name.toLowerCase());
    }
}