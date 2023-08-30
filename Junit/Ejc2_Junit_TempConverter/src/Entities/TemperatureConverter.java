/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author drome
 */
public class TemperatureConverter {
    private double celsius;
    private double fahrenheit;
    private double kelvin;

    public TemperatureConverter() {
    }

    public TemperatureConverter(double celsius, double fahrenheit, double kelvin) {
        this.celsius = celsius;
        this.fahrenheit = fahrenheit;
        this.kelvin = kelvin;
    }

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public double getKelvin() {
        return kelvin;
    }

    public void setKelvin(double kelvin) {
        this.kelvin = kelvin;
    }

    @Override
    public String toString() {
        return "TemperatureConverter{" + "celsius=" + celsius + ", fahrenheit=" + fahrenheit + ", kelvin=" + kelvin + '}';
    }
    
    
    
            
    
}
