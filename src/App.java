/*
 * 
 * Ejercicio: Pedir una nota de 0 al 100 y mostrarla de la forma insuficiente, Suficiente, Bien, Notable y 
 * sobresaliente
 * 
 */


import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        // Declaración de la variable para almacenar la nota
        int nota;

        // Solicitar al usuario que ingrese la nota
        nota = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la nota"));

        // Comprobar la nota y mostrar un mensaje correspondiente
        if (nota >= 90 && nota <= 100) {
            JOptionPane.showMessageDialog(null, "Nota Sobresaliente");
        } else if (nota >= 80) {
            JOptionPane.showMessageDialog(null, "Nota Notable");
        } else if (nota >= 70) {
            JOptionPane.showMessageDialog(null, "Nota Bien");
        } else if (nota >= 60) {
            JOptionPane.showMessageDialog(null, "Nota Suficiente");
        } else if (nota < 60) {
            JOptionPane.showMessageDialog(null, "Nota Insuficiente");
        } else {
            // Si la nota no se ajusta a ninguno de los rangos anteriores, se considera inválida
            JOptionPane.showMessageDialog(null, "Nota inválida");
        }
    }
}
