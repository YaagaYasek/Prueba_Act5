import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner leer = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Alumno[] b = new Alumno[1]; //Modificar cantidad de Registros
        String nombre;
        int edad;
        String sexo;

        for (int i=0;i<b.length;i++){
            System.out.println("Registre Alumno");
            System.out.println("Ingrese Nombre: ");
            nombre = leer.nextLine();
            System.out.println("Ingrese Edad: ");
            edad = leer.nextInt();
            System.out.println("Ingrese Sexo: ");
            sexo = br.readLine();
            b[i] = new Alumno(nombre,edad,sexo);

        }

        for (Alumno alumno : b) {
            System.out.println("\nNombre: " + alumno.getNombre());
            System.out.println("Edad: " + alumno.getEdad());
            System.out.println("Sexo: " + alumno.getSexo());
        }
    }
}
