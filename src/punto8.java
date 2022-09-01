import javax.swing.*;

public class punto8 {
    public static void main(String[] args){
        //Escribir un programa que pida al usuario un número entero
        // positivo y muestre por pantalla la cuenta atrás desde
        // ese número hasta cero separados por comas.

        int numero;
        boolean noHaTerminado = true;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero entero positivo"));

        while(noHaTerminado){
            System.out.print(numero+", ");
            numero--;

            if (numero == -1){
                noHaTerminado = false;

            }
        }
    }
}
