import java.io.*;
public class Ejercicio1 {

    public Ejercicio1() {

    }

    public boolean escribir(String texto, String ruta) {
        boolean check = false;
        FileWriter escritura;
        try {
            escritura = new FileWriter(ruta);
            escritura.write(texto);
            escritura.close();
            check = true;
        } catch (IOException e) {
            System.out.println(e.toString());
            check = false;
        }
        return check;
    }
}
