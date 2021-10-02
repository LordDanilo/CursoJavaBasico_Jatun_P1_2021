public class Ejemplo{
    private int[] arr;

    public Ejemplo(int tam){
        arr = new int[tam];
    }
    public void llenarArray(){
        int valor = 30;   
        for(int pos=0; pos<arr.length; pos++){
            arr[pos] = valor;
            valor++;
        }
    }
    public int obtenerValor(int pos){
        int res;
        if(pos>=0 && pos<arr.length){
            res = arr[pos];
        }else{
            res = -1;
        }
        return res;
    }
    /**
     * Metodo que recibe un array por parametro
     * y deveulve como resultado, la cantidad de numeros pares que tenga
     */
    public int contarPares(int[] arreglo){
        int res = 0;
        for(int pos=0; pos<arreglo.length; pos++){
            int numActual = arreglo[pos];
            if(numActual%2 == 0){
                res++;
            }
        }
        return res;
    }
}
