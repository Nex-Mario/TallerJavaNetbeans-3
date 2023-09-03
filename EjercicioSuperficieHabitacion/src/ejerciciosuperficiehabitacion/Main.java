

package ejerciciosuperficiehabitacion;

public class Main {

    public static void main(String[] args) {
        
        double longitud = 10.5;
        double anchura = 8.4;
        
        double superficie = calculosuperficie(longitud,anchura);
        
        System.out.println("La superficie es: " + superficie);
    }
    
    public static double calculosuperficie(double n1, double n2 ){
        return n1 * n2;
    }
    
}
