/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Services.DiscountService;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author drome
 */
public class DiscountTest {
    
    public DiscountTest() {
    }
    DiscountService ds;
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        ds = new DiscountService();
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void PruebaDescuento(){
        
        assertEquals(90, ds.createDiscount(100, 10).getFinalPrice(),0);
        assertEquals(80, ds.createDiscount(100, 20).getFinalPrice(),0);
        assertEquals(100, ds.createDiscount(100, 0).getFinalPrice(),0);
        
    }

    
}
