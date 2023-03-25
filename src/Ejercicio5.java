import java.io.IOException;
import java.io.Serializable;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
public class Ejercicio5<O> {

    public O objeto;

    public Ejercicio5() {

    }

    public void retornaObjeto(String ruta) {
        FileInputStream lecturaBytes;
        ObjectInputStream lecturaObjeto;

        try {

            lecturaBytes = new FileInputStream(ruta);
            lecturaObjeto = new ObjectInputStream(lecturaBytes);
            objeto = (O) lecturaObjeto.readObject();
            System.out.println(objeto.toString());
            lecturaObjeto.close();
            lecturaBytes.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
