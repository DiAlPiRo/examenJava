import javax.swing.*;

public class punto2 {
    public static void main(String[] args){
        //Escribir un programa que pida al usuario un
        // número entero y muestre por pantalla un
        //triángulo rectángulo como el de más abajo.
        //
        // 1
        // 3 1
        // 5 3 1
        // 7 5 3 1

        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));

        for (int i = 1; i <= numero; i++) {
            if (i % 2 != 0) {

                for (int j = 1; j <= i; j++) {
                    if (j % 2 != 0 ) {

                        System.out.print(j);
                    }
                }
                System.out.println("");

            }
        }
    }
}

