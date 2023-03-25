import java.util.ArrayList;
import java.io.*;

public class Ejercicio6 {

    public Ejercicio6() {

    }

    public String guardarObjetos(ArrayList<Vehiculo> listaObjetos, String ruta, boolean trueFalse) {

        String exito = "Falta información";

        FileOutputStream escrituraBytes = null; // Igualo a null para eliminarlos por si se itera la función
        ObjectOutputStream escrituraObjeto = null;

        if (trueFalse) {

            try {

                escrituraBytes = new FileOutputStream(ruta,true);
                escrituraObjeto = new ObjectOutputStream(escrituraBytes);
                escrituraObjeto.writeObject(listaObjetos);
                escrituraObjeto.close();

                exito = "\n"+"Operación realizada con éxito";

            } catch (IOException e) {
                System.out.println(e.toString());
                exito = "\n"+"Ha habido un error en la operación";
            }

        } else {

            try {

                escrituraBytes = new FileOutputStream(ruta,false);
                escrituraObjeto = new ObjectOutputStream(escrituraBytes);
                escrituraObjeto.writeObject(listaObjetos);
                escrituraObjeto.close();

                exito = "\n"+"Operación realizada con éxito";

            } catch (IOException e) {
                System.out.println(e.toString());
                exito = "\n"+"Ha habido un error en la operación";
            }

        }
        return exito;
    }
}
