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
public class WaterPistol {
    private Integer actualPos;
    private Integer waterPos;
    

    public WaterPistol() {
        
    }

    public WaterPistol(Integer actualPos, Integer waterPos) {
        this.actualPos = actualPos;
        this.waterPos = waterPos;
    }

    public Integer getActualPos() {
        return actualPos;
    }

    public void setActualPos(Integer actualPos) {
        this.actualPos = actualPos;
    }

    public Integer getWaterPos() {
        return waterPos;
    }

    public void setWaterPos(Integer waterPos) {
        this.waterPos = waterPos;
    }

    
    
    

    
    
    

    
    
    
    
}
