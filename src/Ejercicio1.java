import java.io.*;
public class Ejercicio1 {

    public Ejercicio1() {

    }

    public void escribir(String texto, String ruta) {
        FileWriter escribir;
        try {
            escribir = new FileWriter(ruta);
            escribir.write(texto);
            escribir.close();
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
