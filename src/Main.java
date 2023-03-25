import java.util.Scanner;
import java.util.ArrayList;

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
                    String ruta1 = "src\\Ejercicio1.txt";

                    Ejercicio1 ejercicio1 = new Ejercicio1();
                    ejercicio1.escribir(texto1, ruta1);
                    // Faltaría demostración de señal

                    break;

                case 2:

                    // EJERCICIO 2
                    System.out.println("\n"+"Ejercicio 2"+"\n");
                    exito = true;
                    Ejercicio2 ejercicio2 = new Ejercicio2();
                    ejercicio2.leer("src\\Ejercicio1.txt");

                    break;

                case 3:

                    // EJERCICIO 3
                    System.out.println("\n"+"Ejercicio 3"+"\n");
                    exito = true;
                    boolean trueFalse3; // Booleano para la función
                    int suerte3 = (int) (Math.random() * (1 - 0 + 1) + 0); // int para la aleatoriedad

                    if (suerte3==0) {
                        trueFalse3 = false; // Sobreescribir
                    } else {
                        trueFalse3 = true; // No sobreescribir
                    }

                    System.out.println("Introduzca un texto para el ejercicio 3");
                    String texto3 = guardar.nextLine();
                    String ruta3 = "src\\Ejercicio1.txt";
                    Ejercicio3 ejercicio3 = new Ejercicio3();
                    ejercicio3.escrituraDe3(texto3, ruta3, trueFalse3);

                    break;

                case 4:

                    // EJERCICIO 4
                    System.out.println("\n"+"Ejercicio 4"+"\n");
                    exito = true;
                    boolean trueFalse4; // Booleano para la función
                    int suerte4 = (int) (Math.random() * (1 - 0 + 1) + 0); // int para la aleatoriedad

                    if (suerte4==0) {
                        trueFalse4 = false; // Sobreescribir
                    } else {
                        trueFalse4 = true; // No sobreescribir
                    }

                    String ruta4 = "src\\Objeto4.txt";
                    Ejercicio4 ejercicio4 = new Ejercicio4();
                    Vehiculo vehiculo = new Vehiculo();
                    ejercicio4.almacenaObjeto(vehiculo, ruta4, trueFalse4);
                    // FALTA GENERALIDAD

                    break;

                case 5:

                    // EJERCICIO 5

                    System.out.println("\n"+"Ejercicio 5"+"\n");
                    exito = true;

                    String ruta5 = "src\\Objeto4.txt";
                    Ejercicio5 objeto = new Ejercicio5();
                    objeto.retornaObjeto(ruta5);

                    break;

                case 6:

                    // EJERCICIO 6
                    System.out.println("\n"+"Ejercicio 6"+"\n");
                    exito = true;
                    boolean trueFalse6; // Booleano para la función
                    int suerte6 = (int) (Math.random() * (1 - 0 + 1) + 0); // int para la aleatoriedad

                    if (suerte6==0) {
                        trueFalse6 = false; // Sobreescribir
                    } else {
                        trueFalse6 = true; // No sobreescribir
                    }


                    String ruta6 = "src\\Objeto6.txt";
                    Ejercicio6 ejercicio6 = new Ejercicio6();
                    Vehiculo vehiculo6 = new Vehiculo();
                    ArrayList<Vehiculo> listaObjetos = new ArrayList<Vehiculo>();

                    listaObjetos.add(vehiculo6);
                    listaObjetos.add(vehiculo6);
                    listaObjetos.add(vehiculo6);

                    ejercicio6.guardarObjetos(listaObjetos, ruta6, trueFalse6);
                    // FALTA GENERALIDAD
                    break;

                case 7:

                    // EJERCICIO 6
                    System.out.println("\n"+"Ejercicio 7"+"\n");
                    exito = true;

                    String ruta7 = "src\\Objeto6.txt";
                    Ejercicio7 ejercicio7 = new Ejercicio7();
                    ejercicio7.devuelveObjetos(ruta7);

                    break;
            }
        } while (eleccion!=0);



























    }
}
