/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Programa1_Busqueda2D;

/**
 *
 * @author ferch
 */
public class JavaApplication1 {
 // Busca 'objetivo' en la matriz y devuelve [fila, columna] o [-1, -1] si no está
    public static int[] buscar(int[][] matriz, int objetivo) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == objetivo) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               // Matriz 3x3 con valores a elección
        int[][] matriz = {
                {8, 3, 5},
                {1, 9, 7},
                {4, 6, 2}
        };

        int objetivo = 3; // Valor a cambiar

        int[] pos = buscar(matriz, objetivo);

        if (pos[0] != -1) {
            System.out.println("Valor " + objetivo + " encontrado en [fila=" + pos[0] + ", columna=" + pos[1] + "]");
        } 
        else {
            System.out.println("Valor " + objetivo + " NO se encontró en la matriz.");
    }
    
}
    }
