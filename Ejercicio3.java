
package ejercicio3;


public class Ejercicio3 {

    public static void main(String[] args) {
        double Sbruto, RTfuente, Sneto,horasTrabajadas;
        horasTrabajadas = 48;
        Sbruto = horasTrabajadas * 5000;
        RTfuente = Sbruto * (12.5/100);
        Sneto = Sbruto - RTfuente;
        System.out.println("El salario bruto es: "+ Sbruto);
        System.out.println("La retencion de la fuente es: "+ RTfuente);
        System.out.println("El salario neto es: "+ Sneto);
    }
}
