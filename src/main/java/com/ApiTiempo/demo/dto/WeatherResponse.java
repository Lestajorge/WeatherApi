/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ApiTiempo.demo.dto;

/**
 *
 * @author jorge
 */
public class WeatherResponse {
    
    private String temperatura ; 
    private String temp_max ; 
    private String temp_min ; 
    private String ciudad ; 
    private String descripcion; 

    public WeatherResponse(String temperatura, String temp_max, String temp_min, String ciudad, String descripcion) {
        this.temperatura = temperatura;
        this.temp_max = temp_max;
        this.temp_min = temp_min;
        this.ciudad = ciudad;
        this.descripcion = descripcion;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    public String getTemp_max() {
        return temp_max;
    }

    public void setTemp_max(String temp_max) {
        this.temp_max = temp_max;
    }

    public String getTemp_min() {
        return temp_min;
    }

    public void setTemp_min(String temp_min) {
        this.temp_min = temp_min;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
}
