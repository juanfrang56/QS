/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quick;

import static quick.QuickCs.printArray;
import static quick.QuickCs.quickSort;

/**
 *
 * @author juanf
 */
public class Quick {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
       int[] arr = {10, 7, 8, 9, 1, 5};
        int n = arr.length;
        
        System.out.println("Array original:");
        printArray(arr);

        quickSort(arr, 0, n - 1);

        System.out.println("Array ordenado:");
        printArray(arr);
    }
}