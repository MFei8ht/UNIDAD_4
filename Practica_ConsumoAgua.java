package practica_consumoagua;
public class Practica_ConsumoAgua {
    public static void Consumo_casa(int[][]consumo){
            for (int i = 0; i < consumo.length; i++) {
            int p = 0;
            for (int j = 0; j < consumo[i].length; j++) {
                p+= consumo[i][j];
            }
            
            System.out.println("EL CONSUMO DE AGUA SEMANAL DE LA CASA: " + (i + 1) + " es de " + p+"L");
        }
    }
    public static void Consumo_diario(int[][]consumo){
        for (int i = 0; i < consumo[0].length; i++) {
            int a = 0;
            for (int j = 0; j < consumo.length; j++) {
                a += consumo[j][i];
            }


            System.out.println("EL CONSUMO DE AGUA DEL DIA " + (i + 1) + " es de: " + a+"L");
        }        
        
    }
    public static void main(String[] args) {
            int[][] consumo = {
            {100,50,30,120,60},
            {32,122,46,80,90},
            {45,100,56,26,36},
            {60,110,72,33,40}
        };
           Practica_ConsumoAgua.Consumo_casa(consumo);
           Practica_ConsumoAgua.Consumo_diario(consumo);
           System.out.println("Este programa fue elaborado por Octavio Beceril Olivares");

    }
    
    
}
