import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el nombre de usuario: ");
        String usuario = sc.nextLine();
        
        System.out.print("Ingrese la contraseña: ");
        String password = sc.nextLine();
        
        System.out.println("Usuario creado exitosamente:");
        System.out.println("Usuario: " + usuario);
        System.out.println("Contraseña: " + password);

    }

}
