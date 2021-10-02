public class ElFulgorDeLasEstrellas{
    public String verificarEstrellasApagadas(int[] arr, int inicio, int fin){
        String res = "";
        if(inicio<=fin && inicio>=0 && inicio<arr.length && fin>=0 && fin<arr.length){
            int contador = 0;
            for(int pos = inicio; pos<=fin; pos++){
                int numActual = arr[pos];
                if(numActual == 0){
                    contador++;
                }
            }
            res = "Hay "+contador+" estrellas que han dejado de brillar";
        }else{
            res = "Algun dato no es valido";
        }
        return res;
    }
}
