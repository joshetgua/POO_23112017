

package utilidades.mates;

public class Aplicacion {
    public static void main(String[] args) {
        Suma suma = new Suma();
        Potenciar potencia = new Potenciar();
        
        System.out.println("La Suma es:"+suma.suma(5, 2));
        System.out.println("La potencia es:"+potencia.potencia(2, 3));
    }
}
