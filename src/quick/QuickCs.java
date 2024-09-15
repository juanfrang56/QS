/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quick;

/**
 *
 * @author juanf
 */
public class QuickCs {
    
    // Método para realizar QuickSort
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Encontrar el índice de partición
            int pi = partition(arr, low, high);

            // Ordenar las sublistas recursivamente
            quickSort(arr, low, pi - 1);  // Sublista izquierda
            quickSort(arr, pi + 1, high); // Sublista derecha
        }
    }

    // Método para encontrar la partición
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];  // Elegimos el último elemento como pivote
        int i = (low - 1); // Índice del menor elemento

        for (int j = low; j < high; j++) {
            // Si el elemento actual es menor o igual al pivote
            if (arr[j] <= pivot) {
                i++;
                // Intercambiar arr[i] y arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Intercambiar arr[i+1] con el pivote (arr[high])
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;  // Retornar el índice de partición
    }

    // Método para imprimir el array
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}