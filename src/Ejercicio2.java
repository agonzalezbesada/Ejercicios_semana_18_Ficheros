import java.io.*;
public class Ejercicio2 {

    public Ejercicio2() {

    }

    public StringBuffer leer(String ruta) {
        boolean check = false; // Señal que comprueba el proceso
        // Creo una cadena dinámica con StringBuffer
        StringBuffer cadena = new StringBuffer();
        int indice = -1; // Creo un punto de inicio para el índice del StringBuffer
        FileReader lectura;
        try {
            lectura = new FileReader(ruta);
            int caracter = lectura.read();
            while (caracter != -1) {
                indice ++; // Igualo el indice a 0 en la primera vuelta, y en las siguientes aumenta
                char imprimir = (char) caracter;
                cadena.insert(indice,imprimir); // Inserto los char de uno en uno
                caracter = lectura.read();
            }
            lectura.close();
            check = true; // Señal de éxito
        } catch (IOException e) {
            e.printStackTrace();
            cadena.setLength(0); // Vacía el StringBuffer
            cadena.append(e).toString(); // Iguala el StringBuffer a la cadena de error para ser devuelta

            check = false; // Señal de error
        }
        return cadena;
    }
}
