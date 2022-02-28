package registro.de.estudiantes;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Insercion {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int arreglo[],nElementos,pos,aux;
        boolean band = false;
        int dato = 0;
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de elementos: "));
        
        arreglo = new int[nElementos];
        
        System.out.println("Digite el arreglo: ");
        for(int i =0;i<nElementos;i++) {
            System.out.println((i+1)+". Digite un numero: ");
            arreglo[i] = entrada.nextInt();
            
        }
        //Ordenamiento por insercion
        for(int i = 0;i<nElementos;i++) {
            pos = i;
            aux = arreglo[i];
            
            while((pos>0) && (arreglo[pos-1] > aux)){ //Se crea un bucle para que vaya confirmando si el numero anterior es menor.
                arreglo[pos] = arreglo[pos-1];
                pos--;
            }
            arreglo[pos] = aux; //Se refresca el numero actual.
        }
        
        System.out.print("Orden Ascendente: ");
        for(int i = 0; i<nElementos;i++){
            System.out.print("[" + arreglo[i]+"" + "]");
        }
        System.out.println("");
        
        //Busqueda Secuencial
        dato = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero a buscar: "));
        int i=0;
        while(i<nElementos && band == false){
            if(arreglo[i] == dato) {
                band = true;
            }
            i++;
        }
        if(band == false ) {
            JOptionPane.showMessageDialog(null,"El dato no se a encontrado");
        }
        else {
            JOptionPane.showMessageDialog(null, " El numero a sido encontrado en la posicion: " + (i));
        }
    }
}
