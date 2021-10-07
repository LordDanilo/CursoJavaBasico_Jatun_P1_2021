import java.util.Arrays;
public class BusquedaLibreria{
    public int ordenarArray(int[] arr, int buscado){
        Arrays.sort(arr);
        int res = Arrays.binarySearch(arr, buscado);
        return res;
    }
}