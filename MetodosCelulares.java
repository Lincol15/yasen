/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.yasen;

import java.util.ArrayList;
public class MetodosCelulares {
     ArrayList<Celulares> cel=new ArrayList<>();
    
    public void AgregarCelulares(Celulares celulares){
        
        cel.add(celulares);
        System.out.println("SU CELULAR FUE AGREGADO CORRECTAMENTE ");
    }
    
    public ArrayList<Celulares> ListaCelulares(){
        return cel;    
        
        
    }
    public void EliminarCelulares(int selectRow){
        cel.remove(selectRow);
        
        System.out.println("CELULAR ELIMINADO");
    }
    public void ActualizarCelular(int  selectRow, Celulares celulares ){
        
        cel.set(selectRow,celulares);
            
        System.out.println("el celular que eligio fue actualizado correctamente");
    }
    
}

