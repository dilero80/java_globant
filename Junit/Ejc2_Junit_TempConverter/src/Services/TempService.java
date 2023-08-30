/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entities.TemperatureConverter;

/**
 *
 * @author drome
 */
public class TempService {

    public TempService() {
    }
    
    
    
    public TemperatureConverter celsiusto(double celsius){
        double fahrenheit = ((1.8)*celsius) +32;   
        double kelvin = celsius + 273;
        TemperatureConverter T = new TemperatureConverter(celsius, fahrenheit, kelvin );
        return T;
    }
    
    public TemperatureConverter fahrenheitto(double fahrenheit){
        double celsius = 0.556 * (fahrenheit - 32);   
        double kelvin = (0.556 * (fahrenheit - 32)) + 273;
        TemperatureConverter T = new TemperatureConverter(celsius, fahrenheit, kelvin );
        return T;
    }
    
    public TemperatureConverter kelvinto(double kelvin){
        double celsius = kelvin - 273;   
        double fahrenheit = ((1.8)*celsius) +32;   
        TemperatureConverter T = new TemperatureConverter(celsius, fahrenheit, kelvin );
        return T;
    }
    
    
}
