import javax.swing.*;

public class punto10 {
    public static void main(String[] args){
        // Escribir un programa que almacene la cadena de
        // caracteres contraseña en una variable, pregunte al
        // usuario por la contraseña hasta que introduzca
        // la contraseña correcta.

        boolean noHaTerminado = true;
        String password="password", passwordConfirm;

        while(noHaTerminado){
            passwordConfirm = JOptionPane.showInputDialog("Confirme su contraseña");

            if(password.equals(passwordConfirm)){
                JOptionPane.showMessageDialog(null, "Las contraseñas coinciden");
                noHaTerminado = false;
            }else{
                JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden");
            }

        }
    }
}
