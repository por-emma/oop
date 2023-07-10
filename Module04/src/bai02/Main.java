package bai02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String choice = "0";
        QLString ds = new QLString();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter string: ");
            System.out.println("This string cointains " + ds.count(sc.nextLine()) + " characters");
            System.out.print("Enter 0 to continue: ");
            choice = sc.nextLine();
//            sc.nextLine();
        } while (choice.equals("0"));
    }
}
