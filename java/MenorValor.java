/*Faça um programa que lê um vetor de cinquenta elementos e exibe,
ao final, o menor valor lido.
*/

import javax.swing.*;

public class MenorValor {
    public static void main(String[] args) {
        int vetor[] = new int[5];
        int menor = 0;
        String msg = " ";

        for (int i = 0; i < vetor.length; i++){
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));

            if (i == 0) {
                menor = vetor[i];
            }
            if (vetor[i] < menor) {
                menor = vetor[i];
            }

        }
        JOptionPane.showMessageDialog(null, menor);

    }
}