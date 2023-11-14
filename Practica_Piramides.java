package practica_piramides;

import java.util.Scanner;

public class Practica_Piramides {

    public static void Piramide_Asterisco(int h) {

        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void Piramide_Mezclada(int h) {
        int numero = 1;
        char letra = 'A';

        for (int i = 1; i <= h; i++) {
            if (i % 2 != 0) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(numero + "");
                    numero++;
                }
            } else {
                for (int k = 1; k <= i; k++) {
                    System.out.print(letra);
                    letra++;
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
       

        Scanner sc = new Scanner(System.in);
        int opc;
        do {
            System.out.println("***************PIRAMIDES***************");
            System.out.println("Seleccione una opcion: ");
            System.out.println("1. Piramide de asteriscos");
            System.out.println("2. Piramide de letras ");
            System.out.println("3. Salir");
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("Usted eligio piramide de asteriscos");
                    System.out.println("¿De que altura desea la piramide?");
                    int alturaA = sc.nextInt();
                    Piramide_Asterisco(alturaA);
                    break;

                case 2:
                    System.out.println("Usted eligio la piramide de letras");
                    System.out.println("¿De que altura desea la piramide?");
                    int alturaL = sc.nextInt();
                    Piramide_Mezclada(alturaL);

                    break;
                case 3:
                    System.out.println("Ha salidlo del programa");
                    break;
                default:
                    System.out.println("Opcion no válida. Porfavor elija una opcion valida");
                    break;
            }
        } while (opc != 3);
        sc.close();
        System.out.println("Elaborado por Octavio Becerril Olivares");
    }

}
