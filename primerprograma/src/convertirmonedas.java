import  java.util.Scanner;

public class convertirmonedas {

    public static void convertir (String monedaBase, String monedaTarget, consultarmonedas consulta , Scanner lectura){
        double cantidad
        double cantidadConvertida

        Monedas monedas = consulta.buscarMoneda(monedaBase, monedaTarget);
        System.out.println("La tasa convertida para hoy\n1"+monedaBase+"="+monedas.conversion_rate()+"" +monedaTarget);
        System.out.println("Ingrese la cantidad"+monedaBase);
        cantidad = Double.parseDouble(lectura.nextLine());
        cantidadConvertida = cantidad * monedas.conversion_rate();
        System.out.println(cantidad+""+monedaBase+"="+ cantidadConvertida+""+monedas.target_code());

    }


}