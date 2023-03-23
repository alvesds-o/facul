import javax.swing.JOptionPane;

public class Questao07 {
    public static void main(String[] args) {
        
        float base, altura;

        JOptionPane.showMessageDialog(null,
                "Bem-vindo a calculadora de triângulos.\nPara calcularmos a área de um triângulo precisamos saber a sua base e a sua altura.");
        //Valores do usuário
        altura = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da altura"));
        base = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da base"));
        //Resposta
        JOptionPane.showMessageDialog(null, "O valor da área do triângulo é: "+((base*altura)/2));

    }
}
