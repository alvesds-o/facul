import javax.swing.JOptionPane;

public class Questao13 {
    public static void main(String[] args) {
        
        double trabalhoLab, avaliacaoSem, exameFinal, somaNotas;

        JOptionPane.showMessageDialog(null, "Calcular média dos alunos");

        trabalhoLab = Double
                .parseDouble(JOptionPane.showInputDialog("Digite a nota do trabalho de laboratório:\n nota max.: 0-2"));
        avaliacaoSem = Double
                .parseDouble(JOptionPane.showInputDialog("Digite a nota da avaliação semestral:\n nota max.: 0-3 "));
        exameFinal = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do exame final: \nnota max.:0-5 "));
        somaNotas = (trabalhoLab + avaliacaoSem + exameFinal);

        if (trabalhoLab > 2 || avaliacaoSem > 3) {
            errorMessage();
        } 
        else if (exameFinal > 5) {
            errorMessage();
        }
        else {
            JOptionPane.showMessageDialog(null, "A média do aluno foi " + ((+somaNotas / 10) * 100) + "%");
        }
        
        if (somaNotas >= 7) {
            JOptionPane.showMessageDialog(null, "Parabéns. Ele foi aprovado!");
        } else {
            JOptionPane.showMessageDialog(null, "O aluno não atingiu a média suficiente. Precisará ir para o conselho de classe!");
        }
    }

    public static void errorMessage() {
        JOptionPane.showMessageDialog(null, "Error! Valor máximo ultrapassado.");
    }
}
