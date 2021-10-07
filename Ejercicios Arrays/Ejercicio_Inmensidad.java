public class Ejercicio_Inmensidad{
    public int[] ordenar(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1-i; j++){
                int actual = arr[j];
                int vecino = arr[j+1];
                if((actual<vecino && actual%2==0) || (actual%2==0 && vecino%2!=0)){
                    arr[j]   = vecino;
                    arr[j+1] = actual;
                }else{
                    if(actual>vecino && (actual%2 != 0 && vecino%2 != 0)){
                        arr[j]   = vecino;
                        arr[j+1] = actual;
                    }
                }
            }
        }
        return arr;
    }
}
