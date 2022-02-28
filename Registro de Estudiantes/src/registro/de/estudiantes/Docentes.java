//AUTOR: DIEGO FERNANDO GUEVARA GUERRA
package registro.de.estudiantes;

import java.util.Scanner;

//Al comenzar primero se comenzara creando las diferentes variable.   
//que se utilizaran en el proyecto.
//Se utiliza el metodo de abstraccion para crear las variables de la clase Estudiante, creando asi sus variables Nombre, Apellido, Año.

public class Docentes {
    private String nombre;
    private String apellidos;
    private String año;
    private String sección;

    //NY: preguntar al usuario el nombre del docente y su apellido, ademas de su año de curso.
    public Docentes() {
        Scanner in = new Scanner(System.in);
        System.out.print("introducir el primer nombre: ");
        this.nombre = in.nextLine();       
        System.out.print("introducir el apellido: ");
        this.apellidos = in.nextLine();      
        System.out.print("1 - Primer año/n2 - Segundo año/n3 Tercer año/n4 - Cuarto año/n Introducir el año a curso del docente: ");
        this.año = in.nextLine();
        System.out.println("");
        System.out.println("Nombre del docente: " + nombre);
        System.out.println("Apellido del docente: " + apellidos);
        System.out.println("Año a curso: " + año);
    
}
    //NY: introducir los metodos get y set al programa para obtener ciertos datos.

    public String getSección() {
        return sección;
    }

    public void setSección(String sección) {
        this.sección = sección;
    }
   

}
