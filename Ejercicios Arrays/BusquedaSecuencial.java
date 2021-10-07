public class BusquedaSecuencial{
    public boolean busquedaSecuencial(int arr[], int valor){
        boolean res = false;
        for(int pos=0; pos<arr.length; pos++){
            int actual = arr[pos];
            if(actual == valor){
                res = true;
            }
        }
        return res;
    }
}
