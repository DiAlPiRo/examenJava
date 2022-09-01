import javax.swing.*;

public class punto7 {
    public static void main(String[] args){
        //Escribir un programa que almacene la cadena de caracteres
        // contraseña en una variable, pregunte al usuario por la
        //contraseña e imprima por pantalla si la contraseña introducida
        // por el usuario coincide con la guardada en la variable sin
        //tener en cuenta mayúsculas y minúsculas.

        String password, passwordConfirm;

        password= JOptionPane.showInputDialog("Cree una contraseña");
        passwordConfirm = JOptionPane.showInputDialog("Confirme su contraseña");

        if(password.equalsIgnoreCase(passwordConfirm)){
            JOptionPane.showMessageDialog(null, "Las contraseñas coinciden");
        }else{
            JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden");

        }
    }
}
