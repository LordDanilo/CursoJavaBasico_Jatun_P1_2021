public class EjercicioVortice{
    public String buscarVortice(int arr[]){
        int valMayor = arr[0];
        int valMenor = arr[0];
        
        int posMayor = 0;
        int posMenor = 0;
        for(int pos=1; pos<arr.length; pos++){
            int valActual = arr[pos];
            if(valActual>valMayor){
                valMayor = valActual;
                posMayor = pos;
            }else{
                if(valActual<valMenor){
                    valMenor = valActual;
                    posMenor = pos;
                }
            }
        }
        
        int inicio = Math.min(posMayor, posMenor);
        int limite = Math.max(posMayor, posMenor);
        
        String res = "El vortice esta formado por los numeros: ";
        for(int pos=inicio; pos<=limite; pos++){
            int actual = arr[pos];
            res = res + actual+"  ";
        }
        return res;
    }
}
