


import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        int nota;

        nota = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la nota"));

        if (nota >= 90 && nota <= 100) {
            JOptionPane.showMessageDialog(null, "Nota Excepcional");
        } else if (nota >= 80) {
            JOptionPane.showMessageDialog(null, "Nota Notable");
        } else if (nota >= 70) {
            JOptionPane.showMessageDialog(null, "Nota Bien");
        } else if (nota >= 60) {
            JOptionPane.showMessageDialog(null, "Nota Suficiente");
        } else if (nota < 60) {
            JOptionPane.showMessageDialog(null, "Nota Insuficiente");
        } else {
            JOptionPane.showMessageDialog(null, "Nota inválida");
        }
    }
}
