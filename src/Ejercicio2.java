import java.io.*;
public class Ejercicio2 {

    public Ejercicio2() {

    }

    public void leer(String ruta) {

        FileReader lectura;
        try {
            lectura = new FileReader(ruta);
            int caracter = lectura.read();
            while (caracter != -1) {
                char imprimir = (char) caracter;
                System.out.println(imprimir);
                caracter = lectura.read();
            }
            lectura.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
