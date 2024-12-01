/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrizprincipal;

import javax.swing.*;

/**
 *
 * @author REGYANE
 */
public class MatrizPrincipal {

    public static void main(String[] args) {
        Matriz matriz = new Matriz();
        String input;
        int valor;

        // Preenchendo a Matriz A
        JOptionPane.showMessageDialog(null, "Digite os elementos da Matriz A (5x5):");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                input = JOptionPane.showInputDialog("Digite o elemento de A[" + (i + 1) + "][" + (j + 1) + "]: ");
                valor = Integer.parseInt(input);
                matriz.preencherMatrizA(i, j, valor);
            }
        }

        // Preenchendo a Matriz B
        JOptionPane.showMessageDialog(null, "Digite os elementos da Matriz B (5x5):");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                input = JOptionPane.showInputDialog("Digite o elemento de B[" + (i + 1) + "][" + (j + 1) + "]: ");
                valor = Integer.parseInt(input);
                matriz.preencherMatrizB(i, j, valor);
            }
        }

        // Calculando a diferença entre as matrizes A e B
        matriz.calcularDiferenca();

        // Exibindo a matriz de diferença
        String resultado = matriz.exibirDiferenca();
        JOptionPane.showMessageDialog(null, "MATRIZ DIFERENÇA:\n" + resultado);
    }
}
