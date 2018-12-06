/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.modelo;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author LAB2-PC
 */
public class EstructuraArray {
    String nombres[];
    
    public EstructuraArray(){
        JOptionPane.showMessageDialog(null,"Objeto creado");
    }
    
    public void dimensionar(int dim){
        nombres=new String[dim];
    }
    
    public int getDim(){
        return nombres.length;
    }
    
    public void llenarArreglo(){
        for (int i = 0; i < nombres.length; i++) {
            nombres[i]=JOptionPane.showInputDialog("Ingresa el nombre de la posición "+(i+1));
        }
    }
    
    public void imprimir(){
        JOptionPane.showMessageDialog(null,Arrays.toString(nombres));
    }
}
