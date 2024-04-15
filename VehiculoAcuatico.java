/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.transporte;

/**
 *
 * @author FER
 */
public class VehiculoAcuatico extends vehiculo{
    private String tipoPropulsion;
    
    public VehiculoAcuatico(String marca, String modelo, String tipoPropulsion){
        super(marca,modelo);
        this.tipoPropulsion=tipoPropulsion;
     }
     
    public void  mostarInfo(){
        super.mostrarinfo();
        System.out.println("Tipo de propulsion:"+tipoPropulsion);
    }
    
}
