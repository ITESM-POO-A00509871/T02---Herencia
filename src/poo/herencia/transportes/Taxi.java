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
public class Taxi extends Vehiculo{
    
    //Atributos
    public final String sitio;
    
    /**
     * Constructor
     * @param placa
     * @param modelo
     * @param pasajeros
     * @param sitio 
     */
    public Taxi(String placa, String modelo, int pasajeros, String sitio) {
        super(placa, modelo, pasajeros);
        this.sitio = sitio;
    }
    
    /**
     * Devuelve el sitio del taxi
     * @return una cadena de caracteres con el sitio del Taxi
     */
    public String getSitio(){
        return this.sitio;
    }
    
}
