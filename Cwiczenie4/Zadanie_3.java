package Cwiczenie4;

import java.sql.SQLOutput;

import static Cwiczenie4.Main.*;

public class Zadanie_3 extends Zadanie_2{

    private int arraySize;
    private String[] array;
    private int position;

    public void Zadanie_3() {
        position = 0;
        arraySize = 0;
    }

    public void run() {
        newArray();
        fillArray();
        findDisplay();
    }

    private void newArray() {
        do {
            System.out.print("\nArray size: ");
            try {
                arraySize = Integer.parseInt(scanner.nextLine());
                break;
            } catch (IllegalArgumentException iae) {
                System.out.print(ANSI_RED + "Something went wrong. Try again.\n" + ANSI_RESET);
            }
        } while(true);
        array = new String[arraySize];
    }

    private void findDisplay() {
        do {
            try {
                do {
                    System.out.print("\nElement number in array: ");
                position = Integer.parseInt(scanner.nextLine());
                    if (position < arraySize && arraySize >= 0) {
                        System.out.println(position + 1 + " element contains: " + array[position]);
                        break;
                    } else {
                        System.out.print(ANSI_RED + "\nElement doesn't exist. Try again.\n" + ANSI_RESET);
                    }
                }while(true);
                break;
            } catch (IllegalArgumentException iae) {
                System.out.print(ANSI_RED + "Something went wrong. Try again.\n" + ANSI_RESET);
            }
        } while(true);

    }

    private void fillArray() {

        for (int i = 0; i <arraySize; i++) {
            System.out.print(i + 1 + " element: ");
            array[i] = scanner.nextLine();
        }
        System.out.println("Array filled!");

    }
}
