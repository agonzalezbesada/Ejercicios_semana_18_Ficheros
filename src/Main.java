import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner guardar = new Scanner(System.in);

        System.out.println("Introduzca un texto para el ejercicio 1");
        String texto1 = guardar.nextLine();
        /* Forma manual de dar la ruta
        System.out.println("Introduzca una ruta donde guardar ese texto");
        String ruta1 = guardar.nextLine();
         */
        String ruta1 = "G:\\Mi unidad\\DAW\\PROG\\EJERCICIOS\\Ejercicios_semana_18_Ficheros\\src\\Ejercicio1.txt";

        Ejercicio1 ejercicio1 = new Ejercicio1();
        ejercicio1.escribir(texto1, ruta1);

        Ejercicio2 ejercicio2 = new Ejercicio2();
        ejercicio2.leer(ruta1);
    }
}
