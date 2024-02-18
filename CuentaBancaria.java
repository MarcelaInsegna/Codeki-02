package EjercitacionClase02;

import java.util.Scanner;

public class CuentaBancaria {
    private int numeroCuenta;
    private long dniCliente;
    private double saldoActual;
    private double ingresoDinero;
    private double retiroDinero;


    public CuentaBancaria(int numeroCuenta, long dniCliente, double saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.dniCliente = dniCliente;
        this.saldoActual = saldoActual;
    }
    public CuentaBancaria() {
        this.numeroCuenta = 0;
        this.dniCliente = 0;
        this.saldoActual = 0;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(long dniCliente) {
        this.dniCliente = dniCliente;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public void crearCuenta(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero de cuenta: ");
        numeroCuenta = scanner.nextInt();
        System.out.println("Ingrese el DNI: ");
        dniCliente = scanner.nextLong();
        System.out.println("Ingrese el saldo actual: ");
        saldoActual = scanner.nextDouble();
    }
    public double ingresarDinero(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indique la cantidad de dinero a ingresar: ");
        ingresoDinero = scanner.nextDouble();
        return saldoActual += ingresoDinero;
    }
    public double retirarDinero(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indique la cantidad de dinero a extraer: ");
        retiroDinero = scanner.nextDouble();
        if (retiroDinero <=saldoActual){
            return saldoActual -= retiroDinero;
        } else {
            return saldoActual =0;
        }
    }
    public double extraccionRapida(){
        retiroDinero = saldoActual * 0.20;
        System.out.println("El dinero a extraer en forma rapida 1es: " + retiroDinero );
        return saldoActual-=retiroDinero;
    }
    public void consultarSaldo() {
        System.out.println("El Saldo actual es : " + saldoActual);
    }
    public void consultarDatos() {
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("DNI del cliente: " + dniCliente);
        System.out.println("Saldo actual: " + saldoActual);
    }

    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria();

        cuenta.crearCuenta();
        cuenta.consultarDatos();
        cuenta.ingresarDinero();
        cuenta.consultarSaldo();
        cuenta.retirarDinero();
        cuenta.consultarSaldo();
        cuenta.extraccionRapida();
        cuenta.consultarSaldo();
    }
}
