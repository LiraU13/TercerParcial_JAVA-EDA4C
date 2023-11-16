import java.util.Scanner;
import files.Files;

public class CountingSortv3 {
    public static void main(String[] args) {
        System.out.print("\n********** Programa Counting Sort ********** ");
        System.out.println("\nNOTA: Solo tipos de datos int (NO: double, string, negativos) ");

        Files fileManager = new Files();
        Scanner input = new Scanner(System.in);
        System.out.println("\nEscribe el nombre de tu archivo: ");
        String fileName = input.next();

        int[] array = fileManager.leerEnteros(fileName);

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max && array[i] >= 0 && array[i] % 1 == 0) {
                max = array[i];
            }
        }

        int[] countArray = new int[max + 1];
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0 && array[i] % 1 == 0) { 
                countArray[array[i]]++;
            }
        }

        int sortedIndex = 0;
        for (int i = 0; i < countArray.length; i++) {
            while (countArray[i] > 0) {
                array[sortedIndex] = i;
                sortedIndex++;
                countArray[i]--;
            }
        }

        fileManager.arregloArchivo(fileName + " - ordenado por Counting Sort-", array);

        System.out.println("Datos del archivo original: ");
        for (int i : fileManager.leerEnteros(fileName)) { 
            System.out.print(i + " ");
        }

        System.out.println("\nDatos ordenados por el algoritmo: ");
        for (int i : array) {
            System.out.print(i + " ");
        }

        input.close();
    }
}