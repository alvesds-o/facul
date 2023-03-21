import javax.swing.JOptionPane;

public class Questao11 {
    public static void main(String[] args) {
        float salarioFixo = 1320, comissaoVenda = 3, comissaoSobreVendas, vendaTotais, valorCarro = 40000;
        int carroVendido;
        // Apresentação
        JOptionPane.showMessageDialog(null,
                "Boa tarde, prezado(a)! Somos a empresa JavaCar\nVi aqui que você tem interesse em nossa vaga. Clique em ok para prosseguir");
        JOptionPane.showMessageDialog(null,
                "Parabéns, você é o mais novo contratado da nossa empresa!\nVou te passar algumas informações sobre o seu novo emprego, além abordar também as questões salariais");
        JOptionPane.showMessageDialog(null,
                "O seu salário base será de R$ 1.320,00, você também receberá uma comissão de 3% sobre as suas vendas. Boa sorte!!");
        //Captação de valores
        carroVendido = Integer
                .parseInt(JOptionPane.showInputDialog("Digite a quantidade de carros que você vendeu este mês"));
        JOptionPane.showMessageDialog(null, "Cada carro vendido custa em média R$ 40.000,00. Você vendeu R$ "
                + carroVendido * valorCarro + " reais em veículos.");
        JOptionPane.showMessageDialog(null,"--------------- Holerite ----------------\nTotal de vendas: "+carroVendido*valorCarro+"\nSalário base: R$"+salarioFixo+"\nComissão à receber: R$ "+((carroVendido*valorCarro)*comissaoVenda/100)+"\nTotal: R$ "+((carroVendido*valorCarro)*comissaoVenda/100+ salarioFixo)+" reais");

    }
}
