import javax.swing.*;

public class MaiorMenorMedia {
    public static void main(String[] args) {
        int vetor[] = new int[200];
        int maior = 0, menor = 0;

        for (int i = 0; i < vetor.length; i++){
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro: "));

            if (i == 0){
                maior = vetor[i];
            }
            if (vetor[i] > maior){
                maior = vetor[i];
            } else  {
                menor = vetor[i];
            }
        }
        int media = (maior + menor)/2;
        JOptionPane.showMessageDialog(null, "O maior valor digitado foi: "+ maior);
        JOptionPane.showMessageDialog(null, "O menor valor digitado foi: "+ menor);
        JOptionPane.showMessageDialog(null, "A media entre o maior e o menor valor digitado é igual a: "+ media);
        String msg = " ";
        for (int i = 0; i < vetor.length; i++){
            if (vetor[i] > media){
                msg = msg + vetor[i] + " ";
            }
        }
        JOptionPane.showMessageDialog(null, "Os valores digitados acima da média foram: "+ msg);
    }
}
