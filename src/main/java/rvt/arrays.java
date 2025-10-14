package rvt;
public class arrays{
    public static void main(String[] args){
        exrcsise1();
    }
   
    public static void exrcsise1(){
        int[] val  = {0, 1, 2, 3};
        int sum = 0;

        for (int i = 0; i < val.length; i++){
            sum = sum + val[i];
        }
        System.out.println("Sum of all numbers = "+ sum);
    }
    public static void exrcsise2(){
        int[] val = {13, -4, 82, 17};
        int twice;

        System.out.println("Original Array: "+ val[0]+" "+ val[1]+" "+val[2]+" "+val[3]+" "+val[4]);
        int[] nval = new int[val.length];
        for (int i = 0; i < val.length; i++){
            nval[i] = val[i] * 2;
        }
    } 
}
