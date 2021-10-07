import java.util.Arrays;
public class BusquedaBinaria{
    public boolean buscar(int arr[], int buscado){
        Arrays.sort(arr);
        boolean res = false;
        int li = 0;
        int ls = arr.length-1;
        while(li<=ls && res==false){
            int posMedio = (li+ls)/2;
            int valorActual = arr[posMedio];
            if(valorActual == buscado){
                res = true;
            }else{
                if(buscado<valorActual){
                    ls = posMedio-1;
                }else{
                    li = posMedio+1;
                }
            }
        }
        return res;
    }
}
