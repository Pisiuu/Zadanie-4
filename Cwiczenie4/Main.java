package Cwiczenie4;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";

    public static void main(String[] args) {

        Zadanie_2 zadanie_2 = new Zadanie_2();
        Zadanie_3 zadanie_3 = new Zadanie_3();
        Menu menu = new Menu(zadanie_2, zadanie_3);

        menu.printMenu();
    }
}
