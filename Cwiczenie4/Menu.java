package Cwiczenie4;

import static Cwiczenie4.Main.*;

public class Menu {

    private String choice;
    private Zadanie_2 zadanie_2;
    private Zadanie_3 zadanie_3;

    public Menu(Zadanie_2 zadanie_2, Zadanie_3 zadanie_3) {

        choice = "";
        this.zadanie_2 = zadanie_2;
        this.zadanie_3 = zadanie_3;

    }

    public void printMenu() {

        do {
            System.out.print(ANSI_YELLOW + "---- MENU ----\n" + ANSI_RESET +
                    "1. Zadanie 2\n" +
                    "2. Zadanie 3\n" +
                    "3. Zadanie 4\n" +
                    "4. Exit\n" +
                    "\nChoice: ");
            choice = scanner.nextLine();

            switch(choice) {
                case "1":
                    zadanie_2.run();
                    break;
                case "2":
                    zadanie_3.run();
                    break;
                case "3":
                    System.out.println(ANSI_RED + "\nProgram was done this way before\n" + ANSI_RESET);
                    break;
                case "4":
                    System.out.println(ANSI_RED + "\nExiting");
                    break;
                default:
                    System.out.println("\n" + ANSI_RED + "Wrong choice! Choose again." + ANSI_RESET + "\n");
                    choice = "0";
                    break;
            }

        } while (Integer.parseInt(choice) != 4);

    }

}
