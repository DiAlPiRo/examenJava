import javax.swing.*;

public class punto6 {
    public static void main(String[] args){
        //Escribir un programa que pregunte el nombre completo del
        // usuario y después muestre por pantalla el nombre completo
        // del usuario tres veces, una con todas las letras minúsculas,
        // otra con todas las letras mayúsculas y otra solo con la
        //primera letra del nombre y de los apellidos en mayúscula.
        // El usuario puede introducir su nombre combinando mayúsculas
        // y minúsculas como quiera.
        String nombre;

        nombre = JOptionPane.showInputDialog("Ingrese su nombre completo");
        String FirsttLtr =nombre.substring(0,1);
        String restLtr =nombre.substring(1,nombre.length());
        FirsttLtr = FirsttLtr.toUpperCase();

        nombre =FirsttLtr + restLtr;

        System.out.println("MAYUSCULAS:  " + nombre.toUpperCase());
        System.out.println("MINUSCULAS:  " + nombre.toLowerCase());
        System.out.println("PRIMERA MAYUSCULA:  " + nombre);

    }
}
