/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import javax.swing.JOptionPane;
import modulo.Inventario;

/**
 *
 * @author kathe
 */
public class Menu {
    private int opcion;
    private Inventario inventario = new Inventario();
    
    public void menuPrincipal(){
        
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("""
                                                              ==== Tiendita La Margarita ====
                                                              1. Registrar productos.
                                                              2. Consultar informacion.
                                                              3. Actualizar existencias.
                                                              4. salir
                                                              ===============================
                                                              """));
            
            switch (opcion){
                
                case 1:
                    inventario.registroProductos();
                    break;
                case 2:
                    inventario.mostrarInfo();
                    break;
                case 3:
                    inventario.buscarProducto();
                    break;
                case 4:
                    inventario.venderUnidades();
                    break;
                case 5:
                    inventario.reabastecerUnidades();
                    break;
                case 6:
                    inventario.calcularValor();
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null, "Saliendo del sistema . . .");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción invalida, intente con otra.");
                    break;
                
            }//fin del switch
        } while (opcion!= 7);
    }//fin del metodo menu Principal
} //fin de la clase Menu
