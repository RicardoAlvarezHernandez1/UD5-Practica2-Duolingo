package net.salesianos.duolingo.almacendepalabras;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Diccionario {
    
    private Map <String , Set<String>> diccionario = new HashMap<>();

    public void annadirPalabra(String palabra){
        palabra = palabra.toLowerCase().trim();
        String inicial = palabra.substring(0 , 1);
        if( diccionario.containsKey(inicial)){
            Set<String> palabras1 = diccionario.get(inicial);
            palabras1.add(palabra);
            diccionario.put(inicial, palabras1);
        } else {
            Set<String> listaDeNuevasPalabras = new HashSet<>();
            listaDeNuevasPalabras.add(palabra);
            diccionario.put(inicial, listaDeNuevasPalabras);
        }
        System.out.println(diccionario);
    }

    public void eliminarPalabra(String palabra){
        String inicial = palabra.substring(0 , 1);
        palabra = palabra.toLowerCase().trim();
        if( diccionario.containsKey(inicial)){
            Set<String> palabras1 = diccionario.get(inicial);
            System.out.println("Se ha borrado la palabra.");
            palabras1.remove(palabra);
            if (palabras1.size() == 0) {
                diccionario.remove(inicial);
            }
        } else {
            System.out.println("La palabra no estaba almacenada");
        }
        System.out.println(diccionario);
    }

    public void existePalabra(String palabra){
        String inicial = palabra.substring(0 , 1);
        palabra = palabra.toLowerCase().trim();
        if (diccionario.containsKey(inicial)) {
            Set<String> palabras1 = diccionario.get(inicial);
            if (palabras1.contains(palabra)) {
                System.out.println("La palabra está almacenada"); 
            } else {
                System.out.println("La palabra no esta almacenada");
            }
        } else {
            System.out.println("La palabra no esta almacenada");
        }
    }

    public void mostrarIniciales(){
        System.out.println("Estas son las iniciales que tienen alguna palabra almacenada  >:) : ");
        System.out.println(diccionario.keySet()); 

    }

    public void mostrarPalabrasPorInicial(String letra){
        if (letra.length() == 1) {
            System.out.println("La lista de palabras que empiezan por " + letra + " son : ");
            System.out.println(diccionario.get(letra));
        } else {
            System.out.println("Tienes que introducir una sola letra ¯|_(ツ)_|¯ )");
        }
    }
}

