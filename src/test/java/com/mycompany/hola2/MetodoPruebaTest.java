/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.hola2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alumne
 */
public class MetodoPruebaTest {

    MetodoPrueba p;
    int[] lis = {1, 2, 4, 1};

    @Before
    public void setUp() {

        p = new MetodoPrueba();

    }

    @Test
    public void testSumarNumeros() {

        int r = p.sumarNumeros(lis);
        int esperado = 8;
        assertEquals(esperado, r);

    }

}
