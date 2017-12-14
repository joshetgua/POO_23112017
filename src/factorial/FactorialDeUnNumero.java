
package factorial;

import java.util.Scanner;

public class FactorialDeUnNumero {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        System.out.println("Ingrese numero");
        Integer a = dato.nextInt();
        System.out.println(factorial(a));
    }

    public static int factorial(int n) {
        int resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
}



