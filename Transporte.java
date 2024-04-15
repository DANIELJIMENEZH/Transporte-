/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.transporte;

/**
 *
 * @author FER
 */
public class Transporte {

    public static void main(String[] args) {
        //crear un vehiculo terrestre 
        
        VehiculoTerrestre VehiculoTerrestre=new VehiculoTerrestre("Toyota","Corolla", 4);
        VehiculoAcuatico VehiculoAcuatico=new VehiculoAcuatico("Lancha","Yamaha", "Motor");
        
        //mostrar informacion de los vehiculos 
        System.out.println("Mostrar informacion del Vehiculo Terrestre");
        VehiculoTerrestre.mostrarinfo();
        
        System.out.println("Mostrar informacion del Vehiculo Acuatico");
        VehiculoAcuatico.mostrarinfo();
    }
}
