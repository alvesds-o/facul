import javax.swing.JOptionPane;

public class Questao08 {
    public static void main(String[] args) {
        float votosTotal, branco, nulo, valido;

        JOptionPane.showMessageDialog(null, "Bem-vindo às eleições Javenses");
        votosTotal = Float.parseFloat(JOptionPane.showInputDialog("Qual foi a quantidade total de votos?"));
        valido = Float.parseFloat(JOptionPane.showInputDialog("Qual foi a quantidade total de votos válidos?"));
        branco = Float.parseFloat(JOptionPane.showInputDialog("Qual foi a quantidade total de votos em branco?"));
        nulo = Float.parseFloat(JOptionPane.showInputDialog("Qual foi a quantidade de votos nulos?"));
            if(branco+nulo+valido <= votosTotal) {
                JOptionPane.showMessageDialog(null, "As eleições terminaram, vamos às somas...");
                JOptionPane.showMessageDialog(null, "A quantidade total de votos foi de: " + votosTotal);
                JOptionPane.showMessageDialog(null,
                    "A quantidade de votos válidos representou " + valido / votosTotal * 100 + "%");
                JOptionPane.showMessageDialog(null, "Já a quantidade de brancos e nulos representaram um total de "
                    + (branco + nulo) / votosTotal * 100 + "%");
        } else {JOptionPane.showMessageDialog(null, "Eleições fraudulentas, tente novamente!");}
        
        

    }
}
