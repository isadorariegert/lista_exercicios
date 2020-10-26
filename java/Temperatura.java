import javax.swing.*;

/*
Crie um programa que recebe as temperaturas máximas de cada dia de um mês (31 dias) e as
armazene em um vetor. O programa deverá exibir:
- A menor e a maior temperatura do mês;
- A temperatura média mensal;
- Os dias com a temperatura máxima menor do que a temperatura média mensal.
* */
public class Temperatura {
    public static void main(String[] args) {
        int temp[] = new int[5];
        int menor = 0, maior = 0;
        int soma = 0;
        String msg = " ";


        for (int i = 0; i < temp.length; i++) {
            temp[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite a temperatura maxima do dia? "));
            soma = soma + temp[i];

            if (i == 0) {
                maior = temp[i];
            }
            if (temp[i] > maior) {
                maior = temp[i];
            } else {
                menor = temp[i];
            }
            if (temp[i] < (soma / temp.length)) {
                msg = msg + temp[i] + " ";
            }
        }
        JOptionPane.showMessageDialog(null, "A menor temperatura do mes foi: " + menor);
        JOptionPane.showMessageDialog(null, "A maior temperatura do mes foi: " + maior);
        double media = soma / temp.length;
        JOptionPane.showMessageDialog(null, "A temperatura media mensal foi de: " + media);



        for (int i = 0; i < temp.length; i++) {
            if (temp[i] < media) {
                msg = msg + temp[i] + " graus ";
            }
        }
        JOptionPane.showMessageDialog(null, "As temperaturas maximas abaixo da media mensal foram: " + msg);
    }
}
