/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Arrays;




/**
 *
 * @author drome
 */
public class MesSecreto {
    
    final String mes = "enero febrero marzo abril mayo junio julio agosto septiembre octubre noviembre diciembre";
    final String [] meses= mes.split(" ");  
    private String mesSecreto;
    private int mesPos;

    public MesSecreto() {
    }

    public MesSecreto(int mesPos) {
        this.mesPos = mesPos;
        System.out.println("el mesPOS es" + mesPos);
        System.out.println(meses[mesPos]);
        this.mesSecreto = meses[mesPos];
    }

    public String getMesSecreto() {
        return mesSecreto;
    }

    public String[] getMeses() {
        return meses;
    }

    public void setMesPos(int mesPos) {
        this.mesPos = mesPos;
        this.setMesSecreto(meses[mesPos]);
    }
    
    
    private void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "MesSecreto{" + "mes=" + mes + ", meses=" + Arrays.toString(meses) + ", mesSecreto=" + mesSecreto + '}';
    }

    
   

    
    
   
}
