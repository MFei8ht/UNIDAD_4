
package practica1_unidad_4;
import java.util.Scanner;
public class Practica1_Unidad_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculadora");
        double []numeros={20.5,40.6,78.4,94.7,55.3,22.6,84.3};
        System.out.println("QUE QUIERE HACER CON LOS NUMEROS ");
        System.out.println("1. Sumar");
        System.out.println("2. Multiplicar");
        int opcion=scanner.nextInt();
        
        
        //suma=(numeros[0])+(numeros[1])+(numeros[2])+(numeros[3])+(numeros[4])+(numeros[5])+(numeros[6]);
        //multiplicacion=(numeros[0])*(numeros[1])*(numeros[2])*(numeros[3])*(numeros[4])*(numeros[5])*(numeros[6]);
        
        switch (opcion) {
            case 1:
                
            double suma=0;  
            for (int i = 0; i <numeros.length; i++) {
            suma=suma+numeros[i];
        }
                System.out.println("ELEGISTE SUMA");
                System.out.println("El total de la suma de todo su arreglo es de: "+suma);
                break;
                
            case 2:
            
                double multiplicacion=1;
            for (int i = 0; i <numeros.length; i++) {
            
            multiplicacion=multiplicacion*numeros[i];
        }
                System.out.println("ELEGISTE MULTIPLICACION");
                System.out.println("El total de la multiplicacion de todo su arreglo es de: "+multiplicacion);
                break;
            default:
                System.out.println("Por favor ingrese una opcion valida");
        }
    }
}
