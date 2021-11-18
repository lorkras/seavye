import java.util.Scanner;
import java.io.*;

public class Proyecto
{
    static String resultado;
    static int limite=5;
    static String nombreAlimento;
    static int cantidadAlimento;
    static String nombreAlimentoSalida;
    static int cantidadAlimentoSalida;
    static double calorias;
    static double azucares;
    static double grasas;

    public static void main(String[] args){
        Scanner scann = new Scanner(System.in);
        boolean Salida = false;
        int opcion;
        while(!Salida){
            System.out.println("Menú de opciones");
            System.out.println("1.ingresarDatos");
            System.out.println("2.RetirarAlimento");
            System.out.println("3.Salir");
            System.out.println("Selecciona la opción");
            opcion = scann.nextInt();
            switch(opcion){
                case 1:
                    Captura modulocaptura= new Captura();
                    modulocaptura.CapturarProductos();
                    nombreAlimento= modulocaptura.getNombreAlimento();
                    cantidadAlimento= modulocaptura.getCantidadAlimento();
                    calorias= modulocaptura.getCalorias();
                    azucares= modulocaptura.getAzucares();
                    grasas= modulocaptura.getGrasas();
                    Procesamiento moduloprocesamiento = new Procesamiento();
                    String Clasificacion = moduloprocesamiento.clasificarAlimento(calorias,azucares,grasas);
                    Actuador alerta=new Actuador();
                    alerta.alertar(Clasificacion);
                    Persistencia modulopersistencia = new Persistencia();
                    modulopersistencia.guardarDatos(nombreAlimento,cantidadAlimento,calorias,azucares,grasas,Clasificacion);
                    break;

                case 2:
                    Captura modulocapturasalida= new Captura();
                    modulocapturasalida.CapturaProductosSalida();
                    nombreAlimentoSalida= modulocapturasalida.getNombreAlimentoSalida();
                    cantidadAlimento= modulocapturasalida.getCantidadAlimentoSalida();
                    Persistencia modulopersistenciasalida = new Persistencia();
                    modulopersistenciasalida.GuardarListaSalida(nombreAlimentoSalida,cantidadAlimento);
                    
                    break;

                case 3:
                    Salida = true;
                    break;
            }

        }
        
    }

    
}