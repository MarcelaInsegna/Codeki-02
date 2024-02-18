package EjercitacionClase02;

import java.util.Scanner;

public class Circulo implements calculoFormas{

    private double radio;
    public Circulo(double radio) {
        this.radio = radio;
    }


    @Override
    public double calcularArea() {
        return PI * radio * radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * PI * radio;
    }
}
