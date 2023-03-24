import java.io.*;
public class Ejercicio1 {

    public Ejercicio1() {

    }

    public boolean escribir(String texto, String ruta) {
        boolean check = false; // Señal que comprueba el proceso
        FileWriter escritura;
        try {
            escritura = new FileWriter(ruta);
            escritura.write(texto);
            escritura.close();
            check = true; // Señal de éxito
        } catch (IOException e) {
            System.out.println(e.toString());
            check = false; // Señal de error
        }
        return check;
    }
}
