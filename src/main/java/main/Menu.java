/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import javax.swing.JOptionPane;

/**
 *
 * @author kathe
 */
public class Menu {
    private int opcion;
    
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
                    //
                    break;
                case 2:
                    //
                    break;
                case 3:
                    //
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Saliendo del sistema . . .");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción invalida, intente con otra.");
                    break;
                
            }//fin del switch
        } while (opcion!= 4);
    }//fin del metodo menu Principal
} //fin de la clase Menu
