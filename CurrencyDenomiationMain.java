package khusub.question2;

import java.util.Scanner;

public class CurrencyDenomiationMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of currency denominations");
        int size = scanner.nextInt();

        int[] notes = new int[size];

        System.out.println("Enter the currency denominations value");
        for (int i = 0; i < size; i++)
            notes[i] = scanner.nextInt();

        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.bubbleSort(notes);

        System.out.println("Enter the amount you want to pay");
        int amount = scanner.nextInt();

        NotesCountService ncs = new NotesCountService();
        ncs.notesCounter(notes, amount);
    }
}