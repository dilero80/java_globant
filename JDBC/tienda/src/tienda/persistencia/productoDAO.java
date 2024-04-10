/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.persistencia;

import java.util.ArrayList;
import java.util.Collection;
import tienda.entidades.Producto;

/**
 *
 * @author drome
 */
public class productoDAO extends DAO {

    public productoDAO() {
    }
    
   public void guardarProducto(Producto p) throws Exception {
        try {
            if (p == null) {
                throw new Exception("Debe indicar el producto");
            }
            String sql = "INSERT INTO producto (codigo, nombre, precio, codigo_fabricante) "
                    + "VALUES ( " + p.getCodigo()+ " , '" + p.getNombre() + "' ," + p.getPrecio() + " ," + p.getCodigoFabricante() + " );";

            System.out.println(sql);
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }
   
   public void modificarProducto(Producto p) throws Exception {
        try {
            if (p == null) {
                throw new Exception("Debe indicar el producto que desea modificar");
            }
            String sql = "UPDATE producto SET "
                    +  "nombre = '" + p.getNombre() + "' , precio = " + p.getPrecio() + " , codigo_fabricante = " + p.getCodigoFabricante()
                    + " WHERE id = " + p.getCodigo();
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public void eliminarProducto(int codigo) throws Exception {
        try {
            String sql = "DELETE FROM producto WHERE id = " + codigo + "";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    
    public Collection<String> listarNombres () throws Exception{
        try {
            String sql = "SELECT nombre FROM producto";
            consultarBase(sql);
            String nombre = null;
            Collection<String> nombres = new ArrayList();
            while (resultado.next()) {
                nombre = resultado.getString(1);
                nombres.add(nombre);
            }
            desconectarBase();
            return nombres;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
    }
    
   
    
    public Collection<Producto> listarProductos () throws Exception{
        try {
            String sql = "SELECT * FROM producto ";
            consultarBase(sql);
            Producto producto = null;
            Collection<Producto> productos = new ArrayList();
            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigoFabricante(resultado.getInt(4));
                productos.add(producto);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
    }
    
}
