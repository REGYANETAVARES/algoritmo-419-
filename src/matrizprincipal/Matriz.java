/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrizprincipal;

/**
 *
 * @author REGYANE
 */
public class Matriz {
    
private int[][] A = new int[5][5];  // Matriz A
    private int[][] B = new int[5][5];  // Matriz B
    private int[][] DIF = new int[5][5]; // Matriz Diferença

    // Método para preencher a matriz A
    public void preencherMatrizA(int i, int j, int valor) {
        A[i][j] = valor;
    }

    // Método para preencher a matriz B
    public void preencherMatrizB(int i, int j, int valor) {
        B[i][j] = valor;
    }

    // Método para calcular a diferença entre as matrizes A e B
    public void calcularDiferenca() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                DIF[i][j] = A[i][j] - B[i][j];
            }
        }
    }

    // Método para obter a matriz de diferença
    public int[][] getDiferenca() {
        return DIF;
    }

    // Método para exibir a matriz de diferença
    public String exibirDiferenca() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                sb.append(DIF[i][j]).append("\t");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
