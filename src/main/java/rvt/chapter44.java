package rvt;
import java.util.Scanner;
import java.util.ArrayList;

public class chapter44 {
public static void main(String[] args) {

}

public static void ex1() {
Scanner scanner = new Scanner(System.in);

// jautā lietotājam vārdu
System.out.print("Enter your name: ");
String fullName = scanner.nextLine();

// Noņemam lieaks atstarpes sākumā un beigās
fullName = fullName.trim();

// Sadalam vārdu daļās
String[] nameParts = fullName.split(" ");

if (nameParts.length == 2) {
String firstName = nameParts[0];
String lastName = nameParts[1].toUpperCase();

System.out.println("Formatted name: " + firstName + " " + lastName);
} else {
System.out.println("Please enter exactly a first and last name separated by a space.");
}

scanner.close();
}

public static void ex2() {
Scanner scanner = new Scanner(System.in);

// vards inputs
System.out.println("Enter a string:");
String input = scanner.nextLine();

// cikls for preiks katra burta
for (int i = 0; i < input.length(); i++) {
System.out.println(input.charAt(i));
}

scanner.close();
}

public static void ex3() {
Scanner scanner = new Scanner(System.in);
System.out.println("List of names:\r\n Amy\r\n Buffy\r\n Cathy Elroy\r\n Fred\r\n Graham");
while (true) {
System.out.println("Enter your name:");
String name = scanner.nextLine();

}
if (name.equals("")) {
break;
}
Int firstNameNumber = name.trial().toLowerCase().indexOf(" ");
String firstName = name.substring(0, firstNameNumber);
if (firstName.equals("Amy") || firstName.equals("Buffy") || firstName.equals("Cathy")) {
String female = "Ms. ".concat(name);
System.out.println(female);
}
if (firstName.equals("Elory") || firstName.equals("Fred") || firstName.equals("Graham")) {
String male = "Mr. ".concat(name);
System.out.println(male);
}
}

public static void ex4() {
Scanner scanner = new Scanner(System.in);

// Ievadam laiku
System.out.print("Enter cook time-> ");
String input = scanner.nextLine().trim();

int minutes = 0;
int seconds = 0;

if (input.length() <= 2) {
// ja mazak par 2 cipariem tad tas ir sekundes
seconds = Integer.parseInt(input);
} else {
// ja 3 vai vairak tad pedejie 2 cipari ir sekundes
int len = input.length();
seconds = Integer.parseInt(input.substring(len - 2)); // last two digits
minutes = Integer.parseInt(input.substring(0, len - 2)); // remaining digits
}

// Display the formatted time
System.out.println("Your time-> " + minutes + ":" + (seconds < 10 ? "0" + seconds : seconds));

scanner.close();
}

public static void ex6(){

Scanner scanner = new Scanner(System.in);

while (true) {
System.out.println("Enter your password:");
String password = scanner.nextLine();

if (password.length() >= 7) {


if (!password.equals(password.toUpperCase()) &&
!password.equals(password.toLowerCase())) {

boolean hasDigit = false;
for (int i = 0; i < password.length(); i++) {
if (Character.isDigit(password.charAt(i))) {
hasDigit = true;
}
}

if (hasDigit) {
System.out.println("Acceptable password.");
break;
}
}
}

System.out.println("That password is not acceptable.\n");
}
}

public static void ex7(){
Scanner scanner = new Scanner(System.in);

System.out.print("Enter a word -->");
String word = scanner.nextLine();

int spaces = 0; // number of spaces to print at the front

while (word.length() > 0) {

// Print leading spaces
for (int i = 0; i < spaces; i++) {
System.out.print(" ");
}

// Print the word
System.out.println(word);

// Prepare for next loop
spaces++; // increase leading spaces by 1
word = word.substring(1, word.length() - 1);
}
}
}