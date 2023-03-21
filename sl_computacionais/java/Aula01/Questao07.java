import javax.swing.JOptionPane;

public class Questao07 {
    public static void main(String[] args){
        int ano, mes, dia;
        JOptionPane.showMessageDialog(null, "Bem-vindo ao converso de idade");
            //Coleta de informações
            ano = Integer.parseInt(JOptionPane.showInputDialog("Em qual ano você nasceu?"));
            mes = Integer.parseInt(JOptionPane.showInputDialog("Em qual mês você nasceu?"));
            dia = Integer.parseInt(JOptionPane.showInputDialog("Em qual dia você nasceu?"));
            //Cálculo
            JOptionPane.showMessageDialog(null, "Sua idade é de "+((2023 - ano)*365+mes*30+dia+" dias"));
        

        
    }    
}
