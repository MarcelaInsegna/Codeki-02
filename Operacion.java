package EjercitacionClase02;

import java.util.Scanner;

public class Operacion {
    private int numero1;
    private int numero2;

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Operacion() {
        this.numero1 = 0;
        this.numero2 = 0;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public void crearOperacion(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        numero1 = scanner.nextInt();
        System.out.println("Ingrese el segundo numero: ");
       numero2 = scanner.nextInt();
    }

    public int Sumar (){
        return numero1 + numero2;
    }
    public int Restar (){
        return numero1 - numero2;
    }
    public int Multiplicar() {
        if (numero2 == 0) {
            System.out.println("Error, no se puede multiplicar por cero");
            return 0;
        } else {
            return numero1 * numero2;
        }
    }
    public int Dividir() {
        if (numero2 == 0) {
            System.out.println("Error, no se puede dividir por cero");
            return 0;
        } else {
            return numero1 / numero2;
        }
    }
    public static void main(String[] args) {
        Operacion operacion = new Operacion();
        operacion.crearOperacion();
        System.out.println("La suma es: " + operacion.Sumar());
        System.out.println("La resta es: " + operacion.Restar());
        System.out.println("La multiplicación es: " + operacion.Multiplicar());
        System.out.println("La division es: " + operacion.Dividir());
    }
}
