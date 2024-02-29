
package ejercicio5;

public class Ejercicio5 {

    public static void main(String[] args) {
        double radioC, longitudC, areaC;
        radioC = 1;
        longitudC = 2 * Math.PI * radioC;
        areaC = Math.PI * Math.pow(radioC,2);
        System.out.println("El radio del circulo es "+radioC);
        System.out.println("El radio del circulo es "+radioC+ " y su longitud es "+longitudC);
        System.out.println("El radio del circulo es "+radioC+ " y su area es "+areaC);
    }
    
}
