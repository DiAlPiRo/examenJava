import javax.swing.*;

public class punto4 {
    public static void main(String[] args){
        //Escribir un programa que pregunte el nombre del
        // usuario  y un número entero e imprima
        // por pantalla en líneas distintas el nombre del usuario
        // tantas veces como el número introducido.

        int numero;
        String nombre;

        nombre = JOptionPane.showInputDialog("Ingrese su nombre");
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero entero"));

        for (int j= 1; j <= numero; j++){
            System.out.println(j + " " + nombre);

        }
    }
}
