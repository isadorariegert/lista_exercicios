import javax.swing.*;

/*Faça um programa que preenche um vetor com cinquenta elementos inteiros
e alteratodo valor negativo para seu oposto positivo,
ao final o programa deve exibir o vetor ja modificado
*/
public class TerceiroArray {
    public static void main(String[] args) {
        int vetor[] = new int [5];
        String msg = " ";

        for (int i = 0; i < vetor.length; i++){
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro positivo ou negativo: "));

            if (vetor[i] < 0){
                vetor[i] = vetor[i] * (-1);

            } msg = msg + vetor[i] + " ";
        }

        JOptionPane.showMessageDialog(null, msg);
    }
}
