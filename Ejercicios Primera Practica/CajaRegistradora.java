public class CajaRegistradora{
    private int total; //5bs
    
    public CajaRegistradora(){
        total = 0;
    }
    public String registrarPrecio(int precio, int cantidad){
        String respuesta = "";
        if(precio > 0 && cantidad > 0 ){
            total = total+(precio*cantidad);
            respuesta = "Registro de precio exitoso!";
        }else{
            respuesta = "Error! Alguno de los datos no es valido";
        }
        return respuesta;
    }
    public String consultarTotal(){
        return "El total a pagar es: "+total+"Bs.";
    }
    public String cobrar(int dinero){
        String respuesta = "";
        
        if(dinero<total){
            respuesta = "Error: El dinero indicado no cubre la compra";
        }else{
            int cambio = dinero-total;
            respuesta = "Cobro exitoso, el cambio a devolver es: "+cambio+"Bs.";
            total = 0;
        }
        return respuesta;
    }
}
