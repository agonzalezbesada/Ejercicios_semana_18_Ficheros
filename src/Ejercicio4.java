import java.io.*;

public class Ejercicio4<O> {

    public O objeto;

    public Ejercicio4() {

    }
    public void almacenaObjeto(O objeto, String ruta, boolean falseTrue) {

        boolean exito; // Señal que comprueba el proceso
        FileOutputStream escrituraBytes = null; // Igualo a null para eliminarlos por si se itera la función
        ObjectOutputStream escrituraObjeto = null;

        if (falseTrue) {

            try {
                escrituraBytes = new FileOutputStream(ruta,true);
                escrituraObjeto = new ObjectOutputStream(escrituraBytes);
                escrituraObjeto.writeObject(objeto);
                escrituraObjeto.close();
                escrituraBytes.close();

                exito = true;
                System.out.println("\n"+"Operación realizada con éxito");

            } catch (IOException e) {
                e.printStackTrace();
                exito = false;
            }

        } else {

            try {
                escrituraBytes = new FileOutputStream(ruta,false);
                escrituraObjeto = new ObjectOutputStream(escrituraBytes);
                escrituraObjeto.writeObject(objeto);
                escrituraObjeto.close();
                escrituraBytes.close();

                exito = true;
                System.out.println("\n"+"Operación realizada con éxito");

            } catch (IOException e) {
                e.printStackTrace();
                exito = false;
            }
        }
    }
}
