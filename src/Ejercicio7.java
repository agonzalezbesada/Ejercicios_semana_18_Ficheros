import java.io.*;
import java.util.ArrayList;
import java.util.Collection;

public class Ejercicio7<O> {

    public ArrayList<O> listaObjetosLeidos;

    public Ejercicio7() {

    }


    public  ArrayList<O> devuelveObjetos(String ruta) {

        FileInputStream lecturaBytes = null; // Igualo a null para eliminarlos por si se itera la función
        ObjectInputStream lecturaObjetos = null;

        try {
            listaObjetosLeidos = new ArrayList<O>();
            lecturaBytes = new FileInputStream(ruta);
            lecturaObjetos = new ObjectInputStream(lecturaBytes);

            listaObjetosLeidos.addAll((Collection<? extends O>) lecturaObjetos.readObject());

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
        return listaObjetosLeidos;
    }
}
