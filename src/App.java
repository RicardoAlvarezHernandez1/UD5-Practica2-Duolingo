import java.util.Scanner;

import net.salesianos.duolingo.almacendepalabras.Diccionario;

public class App {
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        boolean salida = false;

        Diccionario diccionario = new Diccionario();

        while (salida == false) {
            System.out.println("1. Añadir palabra");
            System.out.println("2. Eliminar palabra");
            System.out.println("3. Existe palabra");
            System.out.println("4. Mostrar iniciales disponibles");
            System.out.println("5. ver palabras por inicial");
            System.out.println("6. Cerrar programa");
            
            int opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Introduzca la palabra que quiere añadir :");
                    String palabraQueAnnadir = teclado.next();
                    diccionario.annadirPalabra(palabraQueAnnadir);
                    break;
                case 2:
                    System.out.println("Introduzca la palabra que quiere borrar :");
                    String palabraBorrar = teclado.next();
                    diccionario.eliminarPalabra(palabraBorrar);
                    break;
                case 3:
                    System.out.println("Introduzca la palabra que quiere buscar :");
                    String palabraQueBuscar = teclado.next();
                    diccionario.existePalabra(palabraQueBuscar);
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                case 6:
                    salida = true;
                    break;
                default:
                    break;
            }
        }
    }
}
