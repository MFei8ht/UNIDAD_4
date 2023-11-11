package practica4_unidad4;
public class Practica4_Unidad4 {    
    public static void Suma(int a,int b){
        int resultadoS=a+b;
        System.out.println("El resultado de la suma de los numeros es de: "+resultadoS); 
    }
    public static void Resta(int a,int b){
        int resultadoR=a-b;
        System.out.println("El resultado de la resta de los numeros es de: "+resultadoR);           
    }
    public static void Multiplicacion(int a,int b){
        int resultadoM=a*b;
        System.out.println("El resultado de la multiplicacion de los numeros es de: "+resultadoM);          
    }        
    public static void Division(int a,int b){
        int resultadoD=a/b;
        System.out.println("El resultado de la division de los numeros es de: "+resultadoD);           
    }    
    public static void main(String[] args) {
        int a=10;
        int b=2;
        Practica4_Unidad4.Suma(a, b);
        Practica4_Unidad4.Resta(a, b);
        Practica4_Unidad4.Multiplicacion(a, b);
        Practica4_Unidad4.Division(a, b);
        System.out.println("Este programa fue elaborado por: Octavio Becerril Olivares");
    }
}