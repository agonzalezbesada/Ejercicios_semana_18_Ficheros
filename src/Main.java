import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner guardar = new Scanner(System.in);

        boolean exito = true;
        int eleccion = 0;

        do {
            System.out.println("\n"+"Que ejercicio desea realizar?"+"\n"+"1. Ejercicio 1"+"\n"+"2. Ejercicio 2"+"\n"+"3. Ejercicio 3"+"\n"+"4. Ejercicio 4"+"\n"+"5. Ejercicio 5"+"\n"+"6. Ejercicio 6"+"\n"+"7. Ejercicio 7");
            eleccion = guardar.nextInt();
            guardar.nextLine();

            switch (eleccion) {

                case 1:

                    // EJERCICIO 1
                    System.out.println("Ejercicio 1"+"\n");
                    exito = true;

                    System.out.println("Introduzca un texto para el ejercicio 1");
                    String texto1 = guardar.nextLine();
                /* Forma manual de dar la ruta
                System.out.println("Introduzca una ruta donde guardar ese texto");
                String ruta1 = guardar.nextLine();
                 */
                    String ruta1 = "G:\\Mi unidad\\DAW\\PROG\\EJERCICIOS\\Ejercicios_semana_18_Ficheros\\src\\Ejercicio1.txt";

                    Ejercicio1 ejercicio1 = new Ejercicio1();
                    ejercicio1.escribir(texto1, ruta1);

                    break;

                case 2:

                    // EJERCICIO 2
                    System.out.println("\n"+"Ejercicio 2"+"\n");
                    exito = true;
                    Ejercicio2 ejercicio2 = new Ejercicio2();
                    ejercicio2.leer("G:\\Mi unidad\\DAW\\PROG\\EJERCICIOS\\Ejercicios_semana_18_Ficheros\\src\\Ejercicio1.txt");

                    break;

                case 3:

                    // EJERCICIO 3
                    System.out.println("\n"+"Ejercicio 3"+"\n");
                    exito = true;
                    System.out.println("Introduzca un texto para el ejercicio 1");
                    String texto3 = guardar.nextLine();
                    String ruta3 = "G:\\Mi unidad\\DAW\\PROG\\EJERCICIOS\\Ejercicios_semana_18_Ficheros\\src\\Ejercicio1.txt";
                    Ejercicio3 ejercicio3 = new Ejercicio3();
                    ejercicio3.escrituraDe3(texto3, ruta3, exito);

                    // Faltan las opciones en true y false
                    break;

                case 4:

                    break;

                case 5:

                    // EJERCICIO 5

                    System.out.println("\n"+"Ejercicio 3"+"\n");
                    exito = true;

                    String ruta5 = "G:\\Mi unidad\\DAW\\PROG\\EJERCICIOS\\Ejercicios_semana_18_Ficheros\\src\\Ejercicio5.txt";
                    Ejercicio5 objeto = new Ejercicio5();
                    objeto.retornaObjeto(ruta5);



                    break;

                case 6:

                    break;

                case 7:

                    break;
            }
        } while (eleccion!=0);



























    }
}
