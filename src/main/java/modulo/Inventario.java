/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modulo;

import javax.swing.JOptionPane;

/**
 *
 * @author kathe
 */
public class Inventario {
    Producto [] producto = new Producto[10];
    
    private int cant = 0;

    public int getCantidad() {
        return cant;
    }//fin del getCantidad
    
    public void registroProductos(){
        
        for (int i= 0; i < producto.length; i++){
            
            int codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo: "));
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre: ");
            int precio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio: "));
            int cantidadProductos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de este producto: "));
            
            producto[i] = new Producto(codigo,nombre,precio,cantidadProductos);
            
            cant++;
        }//fin del for
    }//fin del registroProductos
        
    public void actualizarExistencias(){
        int codigoBuscar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo del producto a buscar: "));
        int indice = -1;
        
        for (int i= 0; i < producto.length; i++){
            if (producto[i] != null && producto[i].getCodigo()==codigoBuscar){
                indice = 1;
                break;
            }
        }//fin del for
        
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                  ¿Qué dato deasea modificar?
                                                                  1. Nombre:
                                                                  2. Precio:
                                                                  3. cantidad:
                                                                  """));
        switch(opcion) {
            
            case 1:
                String nuevoNombre = JOptionPane.showInputDialog("Nuevo nombre: ", producto[indice].getNombre());
                producto[indice].setNombre(nuevoNombre);
                JOptionPane.showMessageDialog(null, "Nombre actualizado: "+ nuevoNombre);
                break;
            
            case 2:
                int nuevoPrecio = Integer.parseInt(JOptionPane.showInputDialog("Nuevo nombre para: ",producto[indice].getPrecio()));
                producto[indice].setPrecio(nuevoPrecio);
                JOptionPane.showMessageDialog(null, "Nombre actualizado: "+ nuevoPrecio);
                break;
            case 3:
                int nuevaCantidad = Integer.parseInt(JOptionPane.showInputDialog("Nuevo nombre para:",producto[indice].getCantidad()));
                producto[indice].setCantidad(nuevaCantidad);
                JOptionPane.showMessageDialog(null, "Nombre actualizado: "+ nuevaCantidad);
                break;
            default:
                break;
        }
        
    }//fin del actualizarExistencias
        
    public void mostrarInfo(){
        
    }//fin del mostrarInfo
    
}//fin de la clase Inventario
