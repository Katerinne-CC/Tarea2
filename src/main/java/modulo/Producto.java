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
public class Producto {
    private int codigo;
    private String nombre;
    private double precio;
    private int cantidad;

    public Producto() {
    }

    public Producto(int codigo, String nombre, double precio, int cantidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    
    
    public void informacionProductos(){
        JOptionPane.showMessageDialog(null, "==== Informacion de los Productos ===="
                                        +"\n Codigo" +codigo
                                        +"\n Nombre: "+ nombre
                                        +"\n Precio: "+ precio
                                        +"\nCantidad: "+ cantidad);
    }
}//fin de la clase Producto     
