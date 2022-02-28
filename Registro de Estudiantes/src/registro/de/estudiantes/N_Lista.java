//AUTOR: DIEGO FERNANDO GUEVARA GUERRA
package registro.de.estudiantes;

import java.util.Scanner;
import javax.swing.JOptionPane;
//Se implementa un metodo de ordenamiento en esta clase para organizar una lista de estudiantes sin importar el orden
//y al final estos se ordenan desde el menor al mayor.
public class N_Lista {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
       int arreglo[], nElementos, aux;

       nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de alumnos de la lista: "));

       arreglo = new int[nElementos]; //Asignamos el numero de elementos del arreglo

       for(int i=0;i<nElementos;i++){
         System.out.println((i+1)+" Introduzca el numero de lista del estudiante: ");
         arreglo[i] = entrada.nextInt();
       }

       //Metodo Burbuja

       for(int i=0;i<(nElementos-1);i++){
           for(int j=0;j<(nElementos-1);j++){
             if(arreglo[j] > arreglo[j+1]){ //Si numeroAcuatual > numeroSguiente
             aux = arreglo[j];
             arreglo[j] = arreglo[j+1];
             arreglo[j+1] = aux;
             }
           }
       }
//Mostrando el arreglo ordenado de forma creciente
       System.out.print("\nOrden de lista de los estudiantes de menor a mayor: ");
       for(int i=0;i<nElementos;i++){
         System.out.print("[" + arreglo[i]+ "]" + "|");
         System.out.print("");

       }
//Metodo de busqueda binaria       
       System.out.print("\nIngrese el numero que desea buscar: ");
       int numBuscar=entrada.nextInt();

       int n=arreglo.length, inf=0,centro=0;
       int sup=n-1;
       boolean bandera=false;
       while(inf<=sup){
         centro=(sup+inf)/2;
         if(arreglo[centro]==numBuscar){
           bandera=true;
           break;
         }
         else if(numBuscar<arreglo[centro]){
            sup=centro-1;
         }
         else{
         inf=centro+1;
         }
       }
       if(bandera==true){
          System.out.println("");
          System.out.println("El numero de busqueda ya se encontro, su posición es la posicion: "+(centro+1));
       }
       else{
         System.out.println("");
         System.out.println("El numero de la busqueda no se ha encontrado");
       }
}
}
