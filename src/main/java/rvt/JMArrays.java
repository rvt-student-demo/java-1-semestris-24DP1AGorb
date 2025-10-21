package rvt;
import java.util.ArrayList;

public class JMArrays {
    public static void main(String[] args) {
        List_size();
    }
    
    public static void List_size() {
        ArrayList<String> wordlist = new ArrayList<>();

        // Pievienojam vārdus sarakstam
        wordlist.add("Tom");
        wordlist.add("Emma");
        wordlist.add("Alex");
        wordlist.add("Mary");

        // Izdrukājam katru vārdu
        for (String name : wordlist) {
            System.out.println(name);
        }

        // Izdrukājam kopējo skaitu
        System.out.println("In total: " + wordlist.size());
    }

    public static void On_the_List(){
        
    }
}