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
    Producto [] producto = new Producto[5];
    
    private int cant = 0;

    public int getCantidad() {
        return cant;
    }//fin del getCantidad
    
    public void registroProductos(){
        
        for (int i= 0; i < producto.length; i++){
            
            int codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo: "));
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre: ");
            double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio: "));
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
        int codigoBuscar = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                        ==== Buscar Productos ===
                                                                        Ingrese el codigo del producto a buscar: 
                                                                        """));
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
        int codigoBuscar = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                        ==== Unidades a Vender ====
                                                                        Ingrese el codigo del producto: 
                                                                        """));
        int indice = -1;
        int unidadesVendidas=0;
        
        for (int i= 0; i < producto.length; i++){
            
            if (producto[i] != null && producto[i].getCodigo()==codigoBuscar){
                indice = i;
                break;
            }
        }
        
        if(indice != -1) {
                unidadesVendidas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad del producto a vender: "));
                
                if (unidadesVendidas <= producto[indice].getCantidad()){
                    int nuevaCantidad = producto[indice].getCantidad() - unidadesVendidas;
                    producto[indice].setCantidad(nuevaCantidad);
                } else {
                    JOptionPane.showMessageDialog(null, "No hay unidades disponibles del producto.");
                }//fin del if
            } else {
                JOptionPane.showMessageDialog(null, "");
            } //fin del if else
            
    }//fin de vender unidades
    
    public void reabastecerUnidades(){
        int codigoBuscar = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                        ==== Reabastecer Unidades ====
                                                                        Ingrese el codigo del producto: 
                                                                        """));
        int indice = -1;
        int cantidadReabastecer;
        int nuevaCantidad = 0;
        
        for (int i= 0; i < producto.length; i++){
            if (producto[i] != null && producto[i].getCodigo()==codigoBuscar){
                indice = i;
                break;
            }
        }//fin del for
        
        if(indice != -1){
                cantidadReabastecer = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nueva cantidad del producto: "));
                
                
                if (cantidadReabastecer > 0){
                    nuevaCantidad = cantidadReabastecer + producto[indice].getCantidad();
                    producto[indice].setCantidad(nuevaCantidad);
                } else{
                        JOptionPane.showMessageDialog(null, "La cantidad debe ser mayor a cero");
                        }
            } else {
                
                JOptionPane.showMessageDialog(null, "Producto no encontrado");
            }//fin del if else
    }//fin de vender unidades
    
    public void calcularValor(){
        double valorTotal = 0;
        
        for (int i= 0; i < producto.length; i++){
            
            if (producto[i] != null){
                valorTotal = valorTotal + (producto[i].getPrecio()*producto[i].getCantidad());
            }
        }//fin del for
        
        JOptionPane.showMessageDialog(null, "El valor total del Inventario: " + valorTotal);
    }//fin de calcular valor
}//fin de la clase Inventario
