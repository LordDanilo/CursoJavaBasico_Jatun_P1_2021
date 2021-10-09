public class EjemploArrayBiDimensional{
    private int [][]matriz;
    public EjemploArrayBiDimensional(int filas, int columnas){
        matriz = new int [filas][columnas];
    }
    
    public void llenarMatriz(){
        int marca = 1;
        for(int fila=0; fila<matriz.length; fila++){
            for(int col=0; col<matriz[fila].length; col++){
                matriz[fila][col] = marca;
                marca++;
            }
        }
    }
}
