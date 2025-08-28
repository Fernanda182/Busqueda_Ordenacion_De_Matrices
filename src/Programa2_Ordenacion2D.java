/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ferch
 */
public class Programa2_Ordenacion2D {
  
       public static void imprimir(int[][] m){
           for (int[] fila : m) {
               System.out.print ("[ ");
               for (int v : fila) {
                   System.out.print(v + "  ");
                                  }
               System.out.print(" ]");
           }
       }
 public static void bubbleSortFila(int[][] m, int fila)  {
    int n = m[fila].length;
    boolean cambio;
    do {
        cambio = false;
                for( int j =0; j < n - 1; j++) {
                    if(m[fila][j] > m[fila][j + 1]) {
                    int tmp = m[fila][j];
                   m[fila][j] = m[fila][j + 1];
                   m[fila][j + 1] = tmp;
                   cambio = true;
                 }
                   }
} while (cambio);  
}
public static void main(String[] args) {
    int[][] matriz = {
        {9, 4, 1},
        {6, 8, 2},
        {7, 3, 5}
                };
    int filaAOrdenar = 1;
    System.out.println("Matriz original: ");
    imprimir(matriz);
    bubbleSortFila(matriz, filaAOrdenar);
    System.out.println("/nMatriz con la fila " + filaAOrdenar +" ordenada ascendente: ");
    imprimir(matriz);
    }
    }

       