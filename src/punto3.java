import javax.swing.*;

public class punto3 {
    public static void main(String[] args){
        //. Escribir un programa para una empresa que tiene salas de
        // juegos para todas las edades y quiere calcular de forma
        // automática el precio que debe cobrar a sus clientes por entrar.
        // El programa debe preguntar al usuario la edad del cliente y
        //mostrar el precio de la entrada. Si el cliente es menor de 4 años
        // puede entrar gratis, si tiene entre 4 y 18 años debe pagar 5000
        // y si es mayor de 18 años, 10000

        int edad;

        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad"));

        if (edad < 4){
            JOptionPane.showMessageDialog(null, "Entrada Gratis");
        } else if(edad >= 4 && edad <= 18){
            JOptionPane.showMessageDialog(null, "El precio a pagar es: $5000");
        }else{
            JOptionPane.showMessageDialog(null, "El precio a pagar es: $10000");

        }
    }
}

