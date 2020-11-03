/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author dvali
 */
public class GenericsMain {

    /**
     * Escribe un método que retorne el último elemento de la lista (ECHO).
     * Escribe un método que de la media de una lista de doubles decimales (chunga).
     * Escribe un método que retorne la cadena mas larga de una lista de cadenas (Muy chunga).
     * Escribe un método que retorne el máximo de una lista de enteros.
     */
    
    public static <T> T ultimo(List<T> lista) throws Exception{
        if(lista.isEmpty()){
            throw new Exception("No hay ningún elemento en la lista",new IllegalArgumentException());
        }else return lista.get(lista.size()-1);
        
    }
    
    public static double media(List<Double> lista2){   
        double resultado = 0;
        for(int i = 0; i<lista2.size(); i++){
           resultado += lista2.get(i);
        }
        return resultado/=lista2.size();
    }
    
    public static String cadenaLarga(List<String> lista){
        String top = lista.get(0);
        for(int i = 0; i<lista.size(); i++){
            if(lista.get(i).length() > top.length()){
                top = lista.get(i);
            }
        }
        return top;
    }
    
    public static int NumeroMax(List<Integer> lista3){
        int tope = lista3.get(0);
        for(int i = 0; i<lista3.size(); i++){
            if(lista3.get(i) > tope){
                tope = lista3.get(i);
            }
        }
        return tope;
    }
    
    public static void main(String[] args) throws Exception {
        List<String> lista = new ArrayList<>();
        lista.add("Marta");
        lista.add("Eva");
        lista.add("Paco");
        lista.add("Antonio");
        //Iterator <String> iter = lista.iterator();
        System.out.println("La lista tiene "+lista.size()+" elementos");
        
        for(Iterator <String> iter = lista.iterator(); iter.hasNext();){
            System.out.println(iter.next());
        }
        
        List<Double> lista2 = new ArrayList<>();
        
        lista2.add(5.0);
        lista2.add(3.5);
        lista2.add(80.1);
        lista2.add(1.4);
        
        List<Integer> lista3 = new ArrayList<>();
        
        lista3.add(5);
        lista3.add(3);
        lista3.add(80);
        lista3.add(1);
        
        ultimo(lista);
        media(lista2);
        cadenaLarga(lista);
        NumeroMax(lista3);
        System.out.println(media(lista2));
        System.out.println(ultimo(lista));
        System.out.println(cadenaLarga(lista));
        System.out.println(NumeroMax(lista3));
    }
    
}
