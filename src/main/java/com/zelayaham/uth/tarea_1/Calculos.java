package com.zelayaham.uth.tarea_1;

public class Calculos {
    public static double areaCirculo(double radio) {
        return Math.PI * radio * radio;
    }

    public static double areaCuadrado(double lado) {
        return lado * lado;
    }

    public static double areaRectangulo(double longitud, double ancho) {
        return longitud * ancho;
    }

    public static double areaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }
}