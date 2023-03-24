import javax.swing.JOptionPane;

public class Questao02 {
    public static void main(String[] args) {
        int num1, num2;

        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número"));

        while (num1 < num2) {
            num1++;
//            if (num1 % 2==1) {
//               System.out.println(num1+" ímpar");
//            }
            if (num1 %2==0) {
                System.out.println(num1+" par");
            }
        }
    }
}

