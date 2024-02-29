
package ejemplo.pkg1;

public class Ejemplo1 {
    
    public static void main(String[] args) {
        int EDJUAN = 9;
        int EDALBERTO, EDANA, EDMAMA;
        EDALBERTO = 2*(EDJUAN/3);
        EDANA = 4*(EDJUAN/3);
        EDMAMA = EDALBERTO + EDANA + EDJUAN;
        System.out.println("LAS EDADES SON:");
        System.out.println("JUAN ="+ EDJUAN);
        System.out.println("ALBERTO ="+ EDALBERTO);
        System.out.println("ANA ="+ EDANA);
        System.out.println("MAMA ="+ EDMAMA);
    }   
}
