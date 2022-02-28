//AUTOR: DIEGO FERNANDO GUEVARA GUERRA

package registro.de.estudiantes;
public class RegistroDeEstudiantes {


    public static void main(String[] args) {
        System.out.println("-------------------------------");
        System.out.println("Registro de alumno");
        System.out.println("");
        Estudiante obj = new Estudiante();
//NY: solicitarle al usuario a introducir el nombre, apellido y año 
//que cursa el estudiante.        
        obj.setAño(4);
        System.out.println("El año de el estudiante es: " + obj.getAño());
        
        System.out.println("-------------------------------");
        System.out.println("Registro de Docente");
        System.out.println("");
        Docentes s = new Docentes();
        
        s.setSección("A");
        System.out.println("La sección del docente es: " + s.getSección());
        System.out.println("");
        System.out.println("-------------------------------");
        
        Interfaz v1 = new Interfaz();
        v1.setVisible(true); // Con esto se hace visible la ventana
    }
    
}
