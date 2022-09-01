import javax.swing.*;

public class punto9 {
    public static void main(String[] args){
        //Escribir un programa que pida al usuario una palabra y
        // la muestre por pantalla 10 veces.

        String palabra;

        palabra = JOptionPane.showInputDialog("Ingrese una palabra");

        for (int i = 1; i <= 10; i++){
            System.out.println(i + " " + palabra);

        }
    }

}
