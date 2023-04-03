import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        double meters = 0;
        boolean validInput = false;

        JOptionPane.showMessageDialog(null, "Informe um valor em metros");
        while (!validInput) {
            String input_1 = JOptionPane.showInputDialog(null, "Metros");
            try {
                meters = Double.parseDouble(input_1);
                validInput = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida!");
            }
        }
        JOptionPane.showMessageDialog(null, meters + " metro(s) convertidos para centímetros é igual a " + meters * 100 + " cm");
    }
}