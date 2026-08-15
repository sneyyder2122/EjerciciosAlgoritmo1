import java.util.Scanner;
public class TercerEjercicio {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            float sualdos, ventas1, ventas2, ventas3 ,comision, SueldoTotal;
            System.out.println("Bienvenido al calculador de comisiones de un vendedor. Por favor, ingrese los siguientes datos.");
            System.out.println("Ingrese el sueldo base del vendedor: ");
            sualdos = input.nextFloat();
            System.out.println("Ingrese el monto de las 3 ventas : ");
            ventas1 = input.nextFloat();
            ventas2 = input.nextFloat();
            ventas3 = input.nextFloat();
            comision = (ventas1 + ventas2 + ventas3) * 0.10f;
            System.out.println("El total de comisiones es: $" + comision);
            SueldoTotal = sualdos + comision;
            System.out.println("El sueldo total a recibir ya con la comision es: $" + SueldoTotal);
        }
        
    }

}
