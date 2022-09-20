/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoeasyparking;

/**
 *
 * @author estivennoguera
 */
public class Moto extends Registro {

    public Moto(String placa, int cntMinutos) {
        super(placa, cntMinutos);
    }
    
    public double calcularTarifa(){
        return super.getCntMinutos()*10;
    }
    
}
