package rvt;
import java.util.ArrayList;
import java.util.Scanner;

public class JMArrays {
public static void main(String[] args) {
    On_the_List();
}

public static void List_size() {
ArrayList wordlist = new ArrayList<>();

// Pievienojam vārdus sarakstam
wordlist.add("Tom");
wordlist.add("Emma");
wordlist.add("Alex");
wordlist.add("Mary");

// Izdrukājam katru vārdu
// for (String name : wordlist) {
// System.out.println(name);
int index = 0;
while (index < wordlist.size()) {
System.out.println(wordlist.get(index));
index = index + 1;
}
System.out.println("In total:" + index);

}

// Izdrukājam kopējo skaitu
// System.out.println("In total: " + wordlist.size());

public static void On_the_List() {
ArrayList wordlist = new ArrayList<>();

wordlist.add("Tom");
wordlist.add("Emma");
wordlist.add("Alex");
wordlist.add("Mary");

Scanner scanner = new Scanner(System.in);
System.out.println("Who are you looking for?:");
String name = String.valueOf(scanner.nextLine());
if (wordlist.contains(name)) {
System.out.println("He/She was found");
} else {
System.out.println("not here");
}
}

public static void Remove_Last() {
ArrayList stringss = new ArrayList<>();

stringss.add("First");
stringss.add("Second");
stringss.add("Third");

System.out.println(stringss);

//removeLast(stringss);
System.out.println(stringss);
}

public static void only_These_numbers() {
ArrayList Numbers = new ArrayList<>();

Numbers.add(1);
Numbers.add(65);
Numbers.add(42);
Numbers.add(0);
Numbers.add(20);
Numbers.add(44);

Scanner scanner = new Scanner(System.in);
System.out.println("From where?");
int from = Integer.valueOf(scanner.nextLine());
System.out.println("To where?");
int to = Integer.valueOf(scanner.nextLine());

for (int i = from; i < to; i++) {
System.out.println(Numbers.get(i));
}
}
}