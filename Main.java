package EjercitacionClase02;

import java.util.Scanner;

public class Main {
    public static void  main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el valor del radio: ");
        double radio = scanner.nextDouble();

        Circulo circulo = new Circulo(radio);

        System.out.println("Círculo:");
        System.out.println("Área: " + circulo.calcularArea());
        System.out.println("Perímetro: " + circulo.calcularPerimetro());

        System.out.println("\nIngrese el valor de la base: ");
        double base = scanner.nextDouble();

        System.out.println("Ingrese el valor de la altura: ");
        double altura = scanner.nextDouble();



        Rectangulo rectangulo = new Rectangulo(base, altura);

        System.out.println("\nRectángulo:");
        System.out.println("Área: " + rectangulo.calcularArea());
        System.out.println("Perímetro: " + rectangulo.calcularPerimetro());
    }
}
