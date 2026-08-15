import java.util.Scanner;

public class NovenoEjercicio {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Bienvenido al calculador de salario neto. Por favor, ingrese los siguientes datos.");
            System.out.print("Ingrese las horas trabajadas: ");
            float horas = sc.nextFloat();
            System.out.print("Ingrese el precio por hora: ");
            float precioHora = sc.nextFloat();

            float sueldoBase = horas * precioHora;
            float impuestos = (float) (sueldoBase * 0.20);
            float salarioNeto = sueldoBase - impuestos;

            System.out.println("Sueldo base: " + sueldoBase);
            System.out.println("impuestos: " + impuestos);
            System.out.println("Salario neto: " + salarioNeto);
        }
    }
}


