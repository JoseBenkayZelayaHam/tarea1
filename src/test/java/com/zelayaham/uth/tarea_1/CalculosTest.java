package com.zelayaham.uth.tarea_1;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalculosTest {

    @Test
    public void testAreaCirculoPositivo() {
        assertEquals(28.274333882308138, Calculos.areaCirculo(3), 0.0001);
    }

    @Test
    public void testAreaCirculoCero() {
        assertEquals(0, Calculos.areaCirculo(0), 0.0001);
    }

    @Test
    public void testAreaCirculoCinco() {
        assertTrue(Calculos.areaCirculo(5) > 78 && Calculos.areaCirculo(5) < 79);
    }

    @Test
    public void testAreaCuadradoPositivo() {
        assertEquals(16, Calculos.areaCuadrado(4), 0.0001);
    }

    @Test
    public void testAreaCuadradoCero() {
        assertEquals(0, Calculos.areaCuadrado(0), 0.0001);
    }

    @Test
    public void testAreaCuadradoCinco() {
        assertTrue(Calculos.areaCuadrado(5) == 25);
    }

    @Test
    public void testAreaRectanguloPositivo() {
        assertEquals(20, Calculos.areaRectangulo(4, 5), 0.0001);
    }

    @Test
    public void testAreaRectanguloCero() {
        assertEquals(0, Calculos.areaRectangulo(0, 5), 0.0001);
    }

    @Test
    public void testAreaRectangulo() {
        assertTrue(Calculos.areaRectangulo(10, 5) == 50);
    }

    @Test
    public void testAreaTrianguloPositivo() {
        assertEquals(10, Calculos.areaTriangulo(4, 5), 0.0001);
    }

    @Test
    public void testAreaTrianguloCeroBase() {
        assertEquals(0, Calculos.areaTriangulo(0, 5), 0.0001);
    }

    @Test
    public void testAreaTrianguloCinco() {
        assertTrue(Calculos.areaTriangulo(10, 5) == 25);
    }
}
