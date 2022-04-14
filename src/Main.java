import javax.sound.midi.Soundbank;
import javax.swing.*;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner leer = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Alumnos Registrados: ");
        Alumno a[]={
                new Alumno("Victor Quintero ", 35, "H"),
                new Alumno("Alan Orozco     ", 32, "H"),
                new Alumno("Dulce Moreno    ", 28, "M"),
                new Alumno("Brenda Salazar  ", 25, "M")
        };

        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

        int n;

        System.out.println("\n¿Cuantos Alumnos vas a Ingresar?");
        n = leer.nextInt();

        Alumno[] b = new Alumno[n]; //Modificar cantidad de Registros
        String nombre;
        int edad;
        String sexo;

        for (int i=0;i<b.length;i++){
            System.out.println("\nRegistre Alumno: ");
            System.out.print("Ingrese Nombre: ");
            nombre = br.readLine();
            System.out.print("Ingrese Edad: ");
            edad = leer.nextInt();
            System.out.print("Ingrese Sexo: ");
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
