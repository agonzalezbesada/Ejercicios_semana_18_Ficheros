import java.io.*;

public class Ejercicio3 {

    public Ejercicio3() {

    }

    public void escrituraDe3(String texto, String ruta, boolean trueFalse) {

        boolean exito; // Señal que comprueba el proceso
        FileWriter escribe = null; // Igualo a null para eliminarlos por si se itera la función
        PrintWriter noSobreescribe = null;

        if (trueFalse) {

            try {
                escribe = new FileWriter("G:\\Mi unidad\\DAW\\PROG\\EJERCICIOS\\Ejercicios_semana_18_Ficheros\\src\\Ejercicio1.txt",true); // El boolean especifica concatenar, no sobreescribir
                noSobreescribe = new PrintWriter(escribe); // Instancio PrintWriter ya que FileWriter no tiene un método para el retorno de carro
                noSobreescribe.print(texto);
                noSobreescribe.close();
                escribe.close();

                exito = true;
                System.out.println("\n"+"Operación realizada con éxito");
            } catch (IOException e) {
                System.out.println("\n"+"Ha habido un error en la operación");
                e.printStackTrace();
                exito = false;
            }

        } else {

            try {
                escribe = new FileWriter("G:\\Mi unidad\\DAW\\PROG\\EJERCICIOS\\Ejercicios_semana_18_Ficheros\\src\\Ejercicio1.txt",false); // El booleano indica sobreescribir
                escribe.write(texto);
                escribe.close();

                exito = true;
            } catch (IOException e) {
                System.out.println("\n"+"Ha habido un error en la operación");
                e.printStackTrace();
                exito = false;
            }

        }
    }
}
