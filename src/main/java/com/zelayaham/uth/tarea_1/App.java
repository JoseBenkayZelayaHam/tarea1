package com.zelayaham.uth.tarea_1;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Seleccione una operación:");
            System.out.println("1. Calcular el area de un circulo");
            System.out.println("2.Calcular el area de un cuadrado");
            System.out.println("3. Calcular el area de un rectángulo");
            System.out.println("4. Calcular el area de un triangulo");
            System.out.println("5. Salir");
            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el radio del circulo: ");
                    double radio = scanner.nextDouble();
                    System.out.println("Área del círculo: " + Calculos.areaCirculo(radio));
                    break;
                case 2:
                    System.out.print("Ingrese el lado del cuadrado: ");
                    double lado = scanner.nextDouble();
                    System.out.println("Área del cuadrado: " + Calculos.areaCuadrado(lado));
                    break;
                case 3:
                    System.out.print("Ingrese la longitud del rectangulo: ");
                    double longitud = scanner.nextDouble();
                    System.out.print("Ingrese el ancho del rectangulo: ");
                    double ancho = scanner.nextDouble();
                    System.out.println("Área del rectangulo: " + Calculos.areaRectangulo(longitud, ancho));
                    break;
                case 4:
                    System.out.print("Ingrese la base del triangulo: ");
                    double base = scanner.nextDouble();
                    System.out.print("Ingrese la altura del triangulo: ");
                    double altura = scanner.nextDouble();
                    System.out.println("Área del triangulo: " + Calculos.areaTriangulo(base, altura));
                    break;
                case 5:
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no valida,seleccione un numero de opcion corrrecto.");
            }
        }
    }
}
