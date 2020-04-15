package Cwiczenie4;

import static Cwiczenie4.Main.*;

public class Zadanie_2 implements Runnable {

    private int number;

    public Zadanie_2() {

        number = 0;

    }

    public void run() {

        do {
            System.out.print("\nType number: ");
            try {
                number = Integer.parseInt(scanner.nextLine());
                System.out.println("Your number: " + ANSI_YELLOW + number + ANSI_RESET + "\n");
                break;
            } catch (IllegalArgumentException iae) {
                System.out.print(ANSI_RED + "Something went wrong. Try again.\n" + ANSI_RESET);
            }
        } while(true);

    }

}
