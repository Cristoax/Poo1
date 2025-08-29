package run;

public class Ejercicio1 {

    public static void main(String[] args)  {

        Persona persona = new Persona();

        persona.nombre = "Gabriela Lopez";
        persona.edad = 18;

        System.out.println(persona.mostrarDatos());

        Coche coche = new Coche();

        coche.marca = "Toyota";
        coche.modelo = "Volkswagen";
        coche.anio = 2020;

        System.out.println(coche.mostrarInfo());

        Libro libro = new Libro();

        libro.titulo = "Crepusculo";
        libro.autor = "Stephenie Meyer";
        libro.numPaginas = 502;

        System.out.println(libro.mostrarDescripcion());

    }

}
