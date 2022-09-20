/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.proyectoeasyparking;

/**
 *
 * @author estivennoguera
 */
public class Registroo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Registro registro = new Carro ("XCS255", 150);
        System.out.println(registro.calcularTarifa());
    }
    
}
