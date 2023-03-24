import java.io.*;
public class Ejercicio2 {

    public Ejercicio2() {

    }

    public boolean leer(String ruta) {
        boolean check = false;
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
            check = true;
        } catch (IOException e) {
            e.printStackTrace();
            check = false;
        }
        return check;
    }
}
