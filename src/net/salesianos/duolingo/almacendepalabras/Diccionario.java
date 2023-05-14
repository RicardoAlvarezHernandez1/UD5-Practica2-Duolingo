package net.salesianos.duolingo.almacendepalabras;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Diccionario {
    
    private Map <String , Set<String>> diccionario = new HashMap<>();

    public void annadirPalabra(String palabra){
        String inicial = palabra.substring(0 , 1);
        palabra = palabra.toLowerCase().trim();
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


    

   
    
}
