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
            double precio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio: "));
            int cantidadProductos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de este producto: "));
            
            producto[i] = new Producto(codigo,nombre,precio,cantidadProductos);
            
            cant++;
        }//fin del for
    }//fin del registroProductos
        
    public void mostrarInfo(){
        for(int i= 0; i < producto.length; i++){
            if (producto[i]!= null){
                producto[i].informacionProductos();
            }//fin del if
        }//fin del for
    }//fin del mostrarInfo
    
    public void buscarProducto(){
        int codigoBuscar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo del producto a buscar: "));
        int indice = -1;
        
        for (int i= 0; i < producto.length; i++){
            if (producto[i] != null && producto[i].getCodigo()==codigoBuscar){
                indice = i;
                break;
            }
        }//fin del for
        
        JOptionPane.showMessageDialog(null, "Producto buscado: " +producto[indice].getNombre());
        
    }//fin de buscar Producto
    
    public void venderUnidades(){
        int codigoBuscar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo del producto: "));
        int indice = -1;
        int unidadesVendidas=0;
        for (int i= 0; i < producto.length; i++){
            
            if (producto[i] != null && producto[i].getCodigo()==codigoBuscar){
                indice = i;
                break;
            }
            
            if(producto[indice]!= null) {
                unidadesVendidas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad del producto a vender: "));
                
                if (unidadesVendidas <= producto[indice].getCantidad()){
                    int nuevaCantidad = producto[indice].getCantidad() - unidadesVendidas;
                    producto[indice].setCantidad(nuevaCantidad);
                } else {
                    JOptionPane.showMessageDialog(null, "No hay unidades disponibles del producto.");
                }//fin de vender unidades
            } else {
                JOptionPane.showMessageDialog(null, "");
            }
        }//fin del for
        
    }//fin de vender unidades
    
    public void reabastecerUnidades(){
        
        
        
    }//fin de vender unidades
    
    public void calcularValor(){
        
        double suma = 0.0;
        double promedio = 0.0;
        
        
        
    }//fin de calcular valor
    
//    public void actualizarExistencias(){
//        int codigoBuscar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo del producto a buscar: "));
//        int indice = -1;
//        
//        for (int i= 0; i < producto.length; i++){
//            if (producto[i] != null && producto[i].getCodigo()==codigoBuscar){
//                indice = 1;
//                break;
//            }
//        }//fin del for
//        
//        int opcion = Integer.parseInt(JOptionPane.showInputDialog("""
//                                                                  ¿Qué dato deasea modificar?
//                                                                  1. Nombre:
//                                                                  2. Precio:
//                                                                  3. cantidad:
//                                                                  """));
//        switch(opcion) {
//            
//            case 1:
//                String nuevoNombre = JOptionPane.showInputDialog("Nuevo nombre: ", producto[indice].getNombre());
//                producto[indice].setNombre(nuevoNombre);
//                JOptionPane.showMessageDialog(null, "Nombre actualizado: "+ nuevoNombre);
//                break;
//            
//            case 2:
//                int nuevoPrecio = Integer.parseInt(JOptionPane.showInputDialog("Nuevo nombre para: ",producto[indice].getPrecio()));
//                producto[indice].setPrecio(nuevoPrecio);
//                JOptionPane.showMessageDialog(null, "Nombre actualizado: "+ nuevoPrecio);
//                break;
//            case 3:
//                int nuevaCantidad = Integer.parseInt(JOptionPane.showInputDialog("Nuevo nombre para:",producto[indice].getCantidad()));
//                producto[indice].setCantidad(nuevaCantidad);
//                JOptionPane.showMessageDialog(null, "Nombre actualizado: "+ nuevaCantidad);
//                break;
//            default:
//                JOptionPane.showMessageDialog(null, "Ingrese una opcion valida.");
//                break;
//        }
//        
//    }//fin del actualizarExistencias
    
}//fin de la clase Inventario
