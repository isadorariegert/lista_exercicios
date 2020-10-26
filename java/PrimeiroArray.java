import javax.swing.*;

public class PrimeiroArray {
    public static void main(String[] args) {
        int [] valores = new int [10];

        for(int i = 0; i < valores.length; i++){
            valores[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));

        }
        for(int i = valores.length-1; i >= 0; i--){
            System.out.println(valores[i]);
        }
    }
}
