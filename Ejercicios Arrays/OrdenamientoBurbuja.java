public class OrdenamientoBurbuja{
    public int[] ordenar(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1-i; j++){
                int actual = arr[j];
                int vecino = arr[j+1];
                if((actual>vecino)){
                    arr[j]   = vecino;
                    arr[j+1] = actual;
                }
            }
        }
        return arr;
    }
}
