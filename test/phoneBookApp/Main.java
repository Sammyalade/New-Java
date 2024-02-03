package phoneBookApp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PhoneBookApp myPhoneBookApp = new PhoneBookApp();
        Scanner collector = new Scanner(System.in);
        System.out.println("PHONEBOOK MENU");
        int option;
        do {
            System.out.println("""
                    1. Add Contact
                    2. Search Contact
                    3. Delete Contact
                    4. Exit
                    """);
            option = collector.nextInt();
            switch (option){
                case 1:
                    System.out.println("Enter the name: ");
                    String name = collector.next();
                    System.out.println("Enter the Phone Number: ");
                    String phoneNumber = collector.next();
                    System.out.println("Contact added successfully");
                    System.out.println(myPhoneBookApp.saveNumber(name, phoneNumber));
                    break;
                case 2:
                    System.out.println("Enter a name to search: ");
                    String searchName = collector.next();
                    System.out.println(myPhoneBookApp.searchNumber(searchName));
                    break;
                case 3:
                    System.out.println("Enter the name of the contact you will like to delete: ");
                    String contactToDelete = collector.next();
                    System.out.println(myPhoneBookApp.DeleteNumber(contactToDelete));
            }
        } while (option != 4);
    }
}