/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoeasyparking;

/**
 *
 * @author estivennoguera
 */
public class Registro {
    private String placa;
    private int cntMinutos;

    public Registro(String placa, int cntMinutos) {
        this.placa = placa;
        this.cntMinutos = cntMinutos;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getCntMinutos() {
        return cntMinutos;
    }

    public void setCntMinutos(int cntMinutos) {
        this.cntMinutos = cntMinutos;
    }
    
    public double calcularTarifa(){
        
        return this.cntMinutos*5;
    }
}
