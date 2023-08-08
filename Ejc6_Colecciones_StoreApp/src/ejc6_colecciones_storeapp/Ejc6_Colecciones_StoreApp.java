/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejc6_colecciones_storeapp;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio, 
 * eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar 
 * Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio. 
 * Realizar un menú para lograr todas las acciones previamente mencionadas. 

 * @author drome
 */
public class Ejc6_Colecciones_StoreApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap<String, Double> ProductList = new HashMap();
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        int optionMenu;
        
        
        do{
            menu();
            optionMenu = read.nextInt();
            switch(optionMenu){
                case 1:
                    addProduct(ProductList);
                    
                    waitKey();
                    
                    break;
                case 2:
                    showProducts(ProductList);
                    waitKey();
                    break;
                case 3:
                    delProduct(ProductList);
                    waitKey();
                    
                    break;
                case 4:
                    changePrice(ProductList);
                    waitKey();
                    break;
                case 5:
                    optionMenu = 5;
                    break;
                default:
                    System.out.println("Opcion no valida");
                    optionMenu = 0;
                    break;
            }
        }while(!(5 == optionMenu));
        
        
        
    }
    
    /**
     * Menu opciones
     */
    public static void menu(){
        System.out.println("=============================");
        System.out.println("------------MENU-------------");
        System.out.println("=============================");
        System.out.println("1. Crear Producto");
        System.out.println("2. Listar Productos");
        System.out.println("3. Eliminar Producto");
        System.out.println("4. Modificar Precio de Producto");
        System.out.println("5. Salir");
        System.out.println("=============================");
        System.out.println("Digite su opcion? ");
    }
    
    public static void waitKey(){
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        String option;
        do{
            System.out.println("Presione C + ENTER para continuar ");
            
            option = read.next();
        }while(!(option.equalsIgnoreCase("C")));
        System.out.println("SALI");
    }
    
    public static void addProduct(HashMap<String, Double> ProductList){
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        String option;
        String productName;
        Double productPrice;
        do{
            System.out.println("=======VAMOS A CREAR PRODUCTO========");
            System.out.println("Digite el nombre del producto");
            productName = read.next();
            System.out.println("Digite el Precio del producto");
            System.out.print("$ ");
            productPrice= read.nextDouble();
            ProductList.put(productName, productPrice);
            System.out.println("Desea agregar otro producto S/N");
            option = read.next().toUpperCase();
            if(option.length()>1 && !option.equals("S") && !option.equals("N") ){
                System.out.println("Opcion no valida");
                
            }
            
            }while(!option.equals("N"));
                 
    }
    
    
    
    public static void delProduct(HashMap<String, Double> ProductList) {
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        String option;
        String productName;
        Boolean flag = false;
        do{
            System.out.println("=======VAMOS A ELIMINAR PRODUCTO========");
            System.out.println("Digite el nombre del producto");
            productName = read.next();
            for (Map.Entry<String, Double> entry : ProductList.entrySet()) {
                String key = entry.getKey();
                if(key.equals(productName)){
                    flag=true;
               }
            }
            
            if (flag){
                ProductList.remove(productName);
                System.out.println("Producto eliminado");
            }else{
                System.out.println("Producto No encontrado");
            }
            System.out.println("Desea eliminar otro Producto S/N");
            option = read.next().toUpperCase();
            if(option.length()>1 && !option.equals("S") && !option.equals("N") ){
                System.out.println("Opcion no valida");
                
            }
            
            }while(!option.equals("N"));
    }
    
    public static void showProducts(HashMap<String, Double> ProductList){
        int spaces, spacesNum;
        int largo, largoNum; 
        int res, resNum;
        System.out.println("=======================LISTADO========================");
        System.out.println("=-------PRODUCTO----------|----------PRECIO----------=");
        for (Map.Entry<String, Double> entry : ProductList.entrySet()) {
            String key = entry.getKey();
            Double value = entry.getValue();
            largo = (int) key.length();
            largoNum = (int) value.toString().length();
            spaces = (int)((25 - largo )/2);
            spacesNum = (int)((27 - largoNum )/2);
            res = ((25 - largo )%2);
            resNum = ((27 - largo )%2);
            System.out.print("=");
            for (int i = 0; i < spaces; i++) {
                System.out.print("-");
            }
            System.out.print( key );
            for (int i = 0; i < spaces + res; i++) {
                System.out.print("-");
            }
            System.out.print("|");
            for (int i = 0; i < spacesNum; i++) {
                System.out.print("-");
            }
            System.out.print("$ " + value);
            for (int i = 0; i < (spacesNum -2 +resNum) ; i++) {
                System.out.print("-");
            }
            System.out.println("=");
            
        }
        System.out.println("======================================================");
    }
    
    public static void changePrice(HashMap<String, Double> ProductList){
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        String option;
        String productName;
        Double newPrice;
        Boolean flag = false;
        
        do{
            System.out.println("=======VAMOS A CAMBIAR PRECIO PRODUCTO========");
            System.out.println("Digite el nombre del producto");
            productName = read.next();
            for (Map.Entry<String, Double> entry : ProductList.entrySet()) {
                String key = entry.getKey();
                Double price = entry.getValue();
                if(key.equals(productName)){
                    flag=true;
                    System.out.println("digite el nuevo precio del producto");
                    newPrice = read.nextDouble();
                    ProductList.replace(productName, newPrice);
                    
                    System.out.println("El producto " + key +"ahora vale $" + newPrice);
                    
                    
               }
            }
            
            if (flag){
                System.out.println("======PRECIO CAMBIO CORRECTAMENTE======");
                
            }else{
                System.out.println("Producto No encontrado");
            }
            System.out.println("Desea cambiar otro Producto S/N");
            option = read.next().toUpperCase();
            if(option.length()>1 && !option.equals("S") && !option.equals("N") ){
                System.out.println("Opcion no valida");
                
            }
            
            }while(!option.equals("N"));
    
    }
}
