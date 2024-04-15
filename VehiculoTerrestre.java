/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.transporte;

/**
 *
 * @author FER
 */
public class VehiculoTerrestre extends vehiculo{
    private int numRuedas;
    
     public VehiculoTerrestre(String marca, String modelo, int numRuedas){
        super(marca,modelo);
        this.numRuedas= numRuedas;
         
    }
       public void  mostarInfo(){
        super.mostrarinfo();
           System.out.println("Numero de Ruedas"+numRuedas);
       }
}

