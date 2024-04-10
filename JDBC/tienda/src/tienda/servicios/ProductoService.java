/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.servicios;

import java.util.Collection;
import tienda.entidades.Producto;
import tienda.persistencia.productoDAO;

/**
 *
 * @author drome
 */
public class ProductoService {

    private productoDAO dao;
    
    public ProductoService() {
        this.dao = new productoDAO();
    }
    
    public void crearProducto(Integer codigo, String nombre, Double precio, Integer codigoFabricante) throws Exception{
        try {
            //Validamos
            if (codigo == null || codigo.toString().trim().isEmpty()) {
                throw new Exception("Debe indicar el codigo");
            }

            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe indicar el nombre");
            }

            if (precio == null || precio.toString().trim().isEmpty()) {
                throw new Exception("Debe indicar el Precio");
            }
            if (codigoFabricante == null || codigoFabricante.toString().trim().isEmpty()) {
                throw new Exception("Debe indicar el Fabricante");
            }

            //Creamos el mascota
            Producto producto = new Producto();
            producto.setCodigo(codigo);
            producto.setNombre(nombre);
            producto.setPrecio(precio);
            producto.setCodigoFabricante(codigoFabricante);
            

            dao.guardarProducto(producto);

        } catch (Exception e) {
            throw e;
        }
    }
    
    
    public Collection<Producto> listarProductos() throws Exception {

        try {

            Collection<Producto> productos = dao.listarProductos();

            return productos;
        } catch (Exception e) {
            throw e;
        }
    }
    
    

    public void imprimirProductos() throws Exception {

        try {

            //Listamos los productos
            Collection<Producto> productos = listarProductos();

            //Imprimimos los productos
            if (productos.isEmpty()) {
                throw new Exception("No existen productos para imprimir");
            } else {
                for (Producto p : productos) {
                    System.out.println(p.toString());
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }
    
    public Collection<String> listarNombres() throws Exception {

        try {

            Collection<String> nombres = dao.listarNombres();

            return nombres;
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void imprimirNombre() throws Exception {

        try {

            //Listamos los productos
            Collection<String> nombres = listarNombres();

            //Imprimimos los nombres
            if (nombres.isEmpty()) {
                throw new Exception("No existen productos para imprimir");
            } else {
                for (String n : nombres) {
                    System.out.println(n);
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }
        
}   
    

