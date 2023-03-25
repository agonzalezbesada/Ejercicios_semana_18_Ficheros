import java.io.IOException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
public class Ejercicio5<O> {

    public O objeto5; // Instancia del objeto a leer

    public Ejercicio5() {

    }

    public O retornaObjeto(String ruta) { // Cambiar retorno
        boolean exito; // Señal que comprueba el proceso

        FileInputStream lecturaBytes = null; // Igualo a null para eliminarlos por si se itera la función
        ObjectInputStream lecturaObjeto = null;

        try {

            lecturaBytes = new FileInputStream(ruta);
            lecturaObjeto = new ObjectInputStream(lecturaBytes);
            objeto5 = (O) lecturaObjeto.readObject().toString(); // Crea una instancia del objeto con generalidad
            System.out.println(objeto5.toString());
            lecturaObjeto.close();
            lecturaBytes.close();

            exito = true;
            System.out.println("\n"+"Operación realizada con éxito");

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("\n"+"Ha habido un error en la operación");
            e.printStackTrace();
            exito = false;
            objeto5 = null;
        }
        return objeto5;
    }
}
