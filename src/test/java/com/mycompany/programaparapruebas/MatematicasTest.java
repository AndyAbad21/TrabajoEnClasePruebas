/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.programaparapruebas;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author PC-1
 */
public class MatematicasTest {
    
    public MatematicasTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }
/*
    @Test
    public void testNumPares() {
        System.out.println("numPares");
        Matematicas instance = null;
        List expResult = null;
        List result = instance.numPares();
        assertEquals(expResult, result);
    }

    @Test
    public void testNum0_n() {
        System.out.println("num0_n");
        Matematicas instance = null;
        List expResult = null;
        List result = instance.num0_n();
        assertEquals(expResult, result);
    }

    @Test
    public void testNumDivisibles() {
        System.out.println("numDivisibles");
        Matematicas instance = null;
        List expResult = null;
        List result = instance.numDivisibles();
        assertEquals(expResult, result);
    }

    @Test
    public void testCalcularSumatoria() {
        System.out.println("calcularSumatoria");
        Matematicas instance = null;
        double expResult = 0.0;
        double result = instance.calcularSumatoria();
        assertEquals(expResult, result, 0.0);
    }
*/
    @Test
    public void testCalcularNotas() {
        System.out.println("calcularNotas");
        List notas=Arrays.asList(5,7,10,6,8,1,2);
        
        Matematicas instance = new Matematicas(notas);
        double expResult = 8.33;
        double result = instance.calcularNotas();
        assertEquals(expResult, result, 0.1);
    }
    
}
