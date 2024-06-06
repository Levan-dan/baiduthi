package doixung;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DoiXung doiXung = new DoiXung();

        System.out.println("Moi nhap mot chuoi de kiem cha.");
        String text = scanner.nextLine();
        doiXung.isPalindrome(text);
    }
}
