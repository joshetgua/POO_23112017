
package metodoRecursivo;

import java.util.Scanner;

public class MetodoRecursivo {
    public static void main(String[] args) {
        int suma1 = 0;
        int suma2 = 1;
       
        Scanner dato = new Scanner(System.in);
        System.out.println("Ingrese numero");
        Integer a = dato.nextInt();
        
        System.out.print(suma1 + ", ");
        System.out.print(suma2 + ", ");
        
        for (int i = 0; i < a - 2 ; i++){
            suma2 = suma1 + suma2;
            suma1 = suma2 - suma1;
            System.out.print(suma2 + ", ");
        }
        
    } 
}
