import java.util.Scanner;

public class CountingSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("\nEscribe el tamaño del array: ");
        int size = input.nextInt();

        int[] array = new int[size];
        int max = Integer.MIN_VALUE;
        
        System.out.println("\nEscribe los valores del array: ");

        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
            if (array[i] > max) {
                max = array[i];
            }
        }

        int[] countArray = new int[max + 1];

        for (int i = 0; i < size; i++) {
            countArray[array[i]]++;
        }

        int sortedIndex = 0;
        for (int i = 0; i < countArray.length; i++) {
            while (countArray[i] > 0) {
                array[sortedIndex] = i;
                sortedIndex++;
                countArray[i]--;
            }
        }

        System.out.println("\nArray ordenado: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

        input.close();
    }
}