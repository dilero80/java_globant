/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Services.TempService;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author drome
 */
public class TestTempConverter {
    
    public TestTempConverter() {
    }
    TempService TS;
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        TS = new TempService();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void createTempWCelsius(){
        assertEquals(90.00,TS.celsiusto(32.22).getFahrenheit(),0.1);
        assertEquals(363.00,TS.celsiusto(90).getKelvin(),0.1);
    }
    
    @Test
    public void createTempWFahrenheit(){
        assertEquals(52.78,TS.fahrenheitto(127.00).getCelsius(),0.1);
        assertEquals(325.78,TS.fahrenheitto(127.00).getKelvin(),0.1);
    }
    
    @Test
    public void createTempWKelvin(){
        assertEquals(127,TS.kelvinto(325.78).getFahrenheit(),0.1);
        assertEquals(52.78,TS.kelvinto(325.78).getCelsius(),0.1);
    }
            
}
