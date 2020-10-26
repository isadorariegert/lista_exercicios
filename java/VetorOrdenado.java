import jdk.management.resource.internal.inst.FileOutputStreamRMHooks;

import javax.swing.*;

public class VetorOrdenado {
    public static void main(String[] args) {
        int vetor [] = new int [50];
        int aux;

        for (int i = 0; i < vetor.length; i++){
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro: "));
        }
        System.out.println("Vetor!!");
        for (int i = 0; i < vetor.length; i++){
            System.out.println("Vetor["+i+"] = "+ vetor[i]);
        }
        for (int j = 0; j < vetor.length; j++) {
            for (int i = 0; i < vetor.length - 1; i++) { //o teste eh com i+1, logo passaria da 9 posicao - por isso o .length-1
                if (vetor[i] > vetor[i + 1]) {
                    aux = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = aux;
                }
            }
        }
        System.out.println("Vetor ORDENADO!!");
        for (int i = 0; i < vetor.length; i++){
            System.out.println("Vetor["+i+"] = "+ vetor[i]);
        }
    }
}
