/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejc5_colecciones_countriesapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
 * usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
 * conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
 * si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
 * los servicios en la clase correspondiente)
 * Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
 * cómo se ordena un conjunto.
 * Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se 
 * buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
 * usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará 
 * al usuario.
 *
 * @author drome
 */
public class Ejc5_Colecciones_CountriesApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashSet <String> countries = new HashSet();
        
        
        fillCountries(countries);
        showCountriesOrdered(countries);
        delCountry(countries);
        showCountriesOrdered(countries);
        
        
        
        
    }
    
    public static void fillCountries(HashSet<String> countries){
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        String option = "N";
        String country;
        do{
            System.out.println("Digite el pais a Agregar");
            country = read.next().toUpperCase();
            countries.add(country);
            System.out.println("Desea agregar otro pais S/N");
            option = read.next().toUpperCase();
            if(option.length()>1 && !option.equals("S") && !option.equals("N") ){
                System.out.println("Opcion no valida");
                
            }
        }while(!option.equals("N"));
        
    }
    
    public static void showCountriesOrdered(HashSet<String> countries) {
        ArrayList <String> countriesList = new ArrayList(countries);
        Collections.sort(countriesList);
        System.out.println("=======LISTA ORDENADA============");
        int cont = 0;
        for (String countryIt : countriesList) {
            cont++;
            System.out.println(cont + " " +countryIt);
        }
    }
    
    
    public static void delCountry(HashSet<String> countries){
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        String countryToDel;
        boolean flag = false;
        System.out.println("Digite el pais a borrar");
        countryToDel = read.next().toUpperCase();
        Iterator iterator = countries.iterator();
        
        while(iterator.hasNext()){
            if (countryToDel.equals(iterator.next())){
                iterator.remove();
                flag = true;
            }
        }
        if (flag){
            System.out.println("Pais eliminado");
        }else{
            System.out.println("Pais no encontrado");
        }
    }
}
