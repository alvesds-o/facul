import javax.swing.JOptionPane;

public class Questao04 {
    public static void main(String[] args) {
        char genero;
        float h;
        //Coleta dos dados que o usuário precisa inputar
        genero = JOptionPane.showInputDialog("Você é do gênero masculino ou feminino?").charAt(0);
        h = Float.parseFloat(
                JOptionPane.showInputDialog("Qual é a sua altura? Digite o valor em cm, exemplo: 1,70m = 170cm"));
        //Condicionais
        if (genero == 'm') {
            JOptionPane.showMessageDialog(null, "Seu peso ideal, é " + ((72.2 * h)/100 - 58) + " kg");
        }
        else if (genero == 'f') {
            JOptionPane.showMessageDialog(null, "Seu peso ideal, é " + ((62.1 * h)/100 - 44.7) + " kg");
        }
        else {
            JOptionPane.showMessageDialog(null, "Os valores inseridos estão incorretos. Por favor, tente novamente mais tarde.");
        }
    }
}
