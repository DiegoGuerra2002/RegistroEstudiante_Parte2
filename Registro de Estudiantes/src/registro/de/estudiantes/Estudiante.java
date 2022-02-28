//AUTOR: DIEGO FERNANDO GUEVARA GUERRA
//       GUILLERMO ALEJANDRO MEZQUITA LOPEZ
//FECHA: 13 DE MARZO
package registro.de.estudiantes;  
import java.util.Scanner;

//Al comenzar primero se comenzara creando las diferentes variable.   
//que se utilizaran en el proyecto.
//Se utiliza el metodo de abstraccion para crear las variables de la clase Estudiante, creando asi sus variables Nombre, Apellido, Año.

public class Estudiante {
    private String Nombre;
    private String Apellido;
    private int año;

    //Luego mediante un public crearemos una forma de pedirle al usuario que ingrese
    //los datos del estudiante.
    
public Estudiante(){
     Scanner in = new Scanner(System.in);
        System.out.print("introducir el primer nombre: ");
        this.Nombre = in.nextLine();       
        System.out.print("introducir el apellido: ");
        this.Apellido = in.nextLine();    
    
}    
    //Con el metodo set y get se estara dando la informacion brindada
    //para ser mostrada en consola.

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }


    
}
