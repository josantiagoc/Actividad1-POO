
package ejercicio2;

class Ejercicio2 {

    public static void main(String[] args) {
        double SUMA, X, Y;
        SUMA = 0;
        X = 20;
        SUMA = SUMA + X;
        Y = 40;
        X = X + Math.pow(Y,2);
        SUMA = SUMA + X/Y;
        System.out.println("EL VALOR DE LA SUMA ES:" + SUMA);
                
    }
    
}
