package practica2_unidad4;
public class Practica2_Unidad4 {
    public static void main(String[] args) {
        char[][]letras=new char[3][5];
        char ch = 'A';
        for (int i=0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                letras[i][j]=ch++;
                System.out.print(letras[i][j]+"  ");
            }
            System.out.println("  ");
        }
    }
}