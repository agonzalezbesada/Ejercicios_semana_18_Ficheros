import java.io.*;
public class Ejercicio1 {

    public Ejercicio1() {

    }

    public void escribir(String texto, String ruta) {
        FileWriter escritura;
        try {
            escritura = new FileWriter(ruta);
            escritura.write(texto);
            escritura.close();
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
