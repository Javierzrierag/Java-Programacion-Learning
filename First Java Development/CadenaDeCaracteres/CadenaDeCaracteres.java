import java.util.Scanner;

public class CadenaDeCaracteres {
    public static void main(String args[]) {

        String nombreUno = "";
        String nombreDos = "";
        Scanner entrada = new Scanner(System.in);
        String usuario = "", password = "";

        System.out.print("Por favor ingresa el primer nombre: ");
        nombreUno = entrada.nextLine();

        System.out.print("Por favor ingresa el segundo nombre: ");
        nombreDos = entrada.nextLine();

        if(nombreUno.equalsIgnoreCase(nombreDos) ){

            System.out.println("Los nombres son iguales ");
        } else {
            System.out.println("Los nombres son diferentes ");
        }

// Aqui empieza un test de como hacer in Login

        System.out.print("Ingresa tu nombre de usuario ");
        usuario = entrada.nextLine();

        System.out.print("Ingresa tu contraseña ");
        password = entrada.nextLine();

        if(usuario.equals("javier") && password.equals("123456")){
            System.out.println("Inicio de sesion correcto ");

        } else{
            System.out.println("Nombre de usuario o contraseña incorrectos ");
        }

    }
}
