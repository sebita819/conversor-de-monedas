import  java.util.Scanner;
public class principal {
    public static void main(String[] args){

        Scanner lectura = new Scanner(System.in);
        consultarmonedas consulta = new consultarmonedas();

        int opcion=0
        while (opcion !=8){
           System.out.println("++++++++++++++++++\n"+
                   "Bienvenidos al conversor de monedas\n\n" +
                   "Ingresa la conversion que deseas realizar \n\n"+
                   "1. Dollar a peso Argentino\n"+
                   "2. Peso Argentino a Dollar\n"+
                   "3. Dollar a Real Brasilero\n+"+
                   "4. Real Brasilero a Dollar\n"+
                   "5. Dollar a Peso Colombiano\n"+
                   "6. Peso Colombaino a Dollar\n"+
                   "7. Salir");
           opcion = lectura.nextInt();
           lectura.nextLine();

           switch (opcion) {
               case 1 :
                   convertirmonedas.convertir(monedaBase"USD",monedaTarget,"ARS",consulta , lectura);
                   break;
               case 2 :
                   convertirmonedas.convertir(monedaBase"ARS",monrdaTarget"USD",consulta , lectura);
                   break;
               case 3 :
                   convertirmonedas.convertir(monedaBase"USD",monrdaTarget"BRL",consulta , lectura);
                   break;
               case 4 :
                   convertirmonedas.convertir(monedaBase"BRL",monrdaTarget"USD",consulta , lectura);
                   break;
               case 5 :
                   convertirmonedas.convertir(monedaBase"USD",monrdaTarget"COP",consulta , lectura);
                   break;
               case 6 :
                   convertirmonedas.convertir(monedaBase"COP",monrdaTarget"USD",consulta , lectura);
                   break;
               case 7 :
                   System.out.println("Saliendo...");
               default:
                   System.out.println("Opcion no valida");
                   break;
           }

        }
    }
}