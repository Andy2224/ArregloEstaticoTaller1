/*
Diseñe un algoritmo; de tal manera, que le permita la creación de un array de
Meses del año.
 */
package arregloestaticotaller1;
/**
 *
 * @author Ivan Andres Mogollon Sumarraga
 */
public class ArregloEstaticoTaller1 {

    public static void main(String[] args) {
     System.out.println("         UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE        ");
     System.out.println("                      Sede Latacunga        \n");
     System.out.println("Nombre y Apellido: Andrés Mogollón S. ");
     System.out.println("Materia: Programacion [7450] \n");
     System.out.println("         MESES DEL AÑO \n");
    String[] arr;
        arr=new String[12];
        arr[0] = "Enero";
        arr[1]= "Febrero";
        arr[2]= "Marzo";
        arr[3]= "Abril";
        arr[4]= "Mayo";
        arr[5]= "Junio";
        arr[6]= "Julio";
        arr[7]= "Agosto";
        arr[8]= "Septiembre";
        arr[9]= "Octubre";
        arr[10]= "Noviembre";
        arr[11]= "Diciembre";
        for(int i=0; i<arr.length;i++)
            System.out.println("El elemento " +i+" pertenece al mes : "+arr[i]);
    }

}
