import javax.swing.JOptionPane;

public class Questao16 {
    public static void main(String[] args) {

        int num1, num2, num3, num4;

        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número"));
        num3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número"));
        num4 = Integer.parseInt(JOptionPane.showInputDialog("Digite o quarto número"));

        if (num1 > num2 && num2 > num3) {
            maiorQue(num1, num2, num3, num4);
        } 
        else if(num2 > num1 && num1 > num3){
            maiorQue(num2, num1, num3, num4);
        } 
        else if (num3 > num2 && num2 > num1) {
            maiorQue(num3, num2, num1, num4);
        } 
        else if(num2 > num3 && num3 > num1 ) {
            maiorQue(num2, num3, num1, num4);
        }
        
        if (num1 > num2 && num2 > num3) {
            maiorQue(num1, num2, num3, num4);
        } 
        else if(num2 > num1 && num1 > num3){
            maiorQue(num2, num1, num3, num4);
        } 
        else if (num3 > num2 && num2 > num1) {
            maiorQue(num3, num2, num1, num4);
        } 
        else if (num2 > num3 && num3 > num1) {
            maiorQue(num2, num3, num1, num4);
        }
        else if (num4 > num1 && num4 > num2) {
            maiorQue(num4, num1, num2, num3);
        }
        else if (num1 > num4 && num2 > num4) {
            maiorQue(num1, num2, num4, num3);
        }
        else if (num4 > num1 && num2 > num4) {
            maiorQue(num2, num4, num1, num3);
        }
        else if (num3 > num4 && num2 > num1) {
            maiorQue(num3, num4, num2, num1);
        }
        else if (num1 > num3 && num4 > num2) {
            maiorQue(num1, num3, num4, num2);
        }
    }

    public static void maiorQue(int a, int b, int c, int d) {
        JOptionPane.showMessageDialog(null, a+","+b+","+c+" e "+d);
    }
}
