/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.herencia.transportes;

/**
 *
 * @author User
 */
public class Vehiculo {
    //Atributos
    private final String placa;
    private final String modelo;
    private final int pasajeros;
    
    //Métodos
    /**
     * Constructor
     * @param placa Es la placa del vehiculo
     * @param modelo El modelo del vehiculo
     * @param pasajeros Es el numero de pasajeros
     */
    public Vehiculo(String placa, String modelo, int pasajeros){
        this.placa = placa;
        this.modelo = modelo;
        this.pasajeros = pasajeros;
    }
    
    /**
     * Método para devolver el numero de placa del vehiculo
     * @return regresa un string con el numero de la placa
     */
    public String getPlaca(){
        return this.placa;
    }
    
    /**
     * Método para devolver el nombre del modelo del vehiculo
     * @return una cadena de caracteres que representa el modelo del vehiculo
     */
    public String getModelo(){
        return this.modelo;
    }
    
    /**
     * Método para devolver la capacidad de pasajeros del vehiculo
     * @return un entero con la cantidad de pasajeros que caben en el vehiculo
     */
    public int getPasajeros(){
        return this.pasajeros;
    }
}
