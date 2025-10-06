package rvt;
public class division{
    public static void main(String[] args)
    {
        divisionbythree(3, 6);

    }
    public static void divisionbythree(int number_one, int number_two){
        int i = number_one;
        while (i < number_two + 1){
            if(i % 3 == 0){
                System.out.println(i);
            }
            i++;
        }
    }

    }
