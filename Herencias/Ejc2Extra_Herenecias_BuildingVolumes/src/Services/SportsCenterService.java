/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entities.SportsCenter;

/**
 *
 * @author drome
 */
public class SportsCenterService {

    public SportsCenterService() {
    }
    
    public String getType(SportsCenter sc){
        return sc.getType();
        
    }
    
}
