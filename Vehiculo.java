/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.transporte;

/**
 *
 * @author FER
 */
public class vehiculo {
    protected String marca;
    protected String modelo;
    
    public vehiculo(String marca, String modelo){
        this.marca=marca;
        this.modelo=modelo;
    }
    
    public void mostrarinfo(){
        System.out.println("Marca"+marca);
        System.out.println("modelo"+modelo);
    }
}
