public class Actuador
{
   
    public void alertar (String resultado){
        
        
        if(resultado.equals("alimento poco saludable ")){
            String alerta=("¡ALERTA DE CONSUMO EXCESIVO!");
            System.out.println(alerta);
        }else{
        System.out.println("alimento saludable");
        }
    
    
}}