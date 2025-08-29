package run3;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);

        Estudiante estudiante = new Estudiante();

        System.out.println("Ingrese el nombre del estudiante");
        estudiante.nombre = sc.nextLine();

        System.out.println("Ingrese la matricula del estudiante");
        estudiante.matricula = sc.nextInt();

        System.out.println("Ingrese el promedio del estudiante");
        estudiante.promedio = sc.nextDouble();

        if (estudiante.promedio >= 70) {
            System.out.println("El estudiante aprobo satisfactoriamente");
        } else { System.out.println("El estudiante reprobo"); }
    }
}