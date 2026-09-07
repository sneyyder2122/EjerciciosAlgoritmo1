import java.util.Scanner;
public class DiecisieteavoEjercicio {
    public static void main(String[] args) {
        int rango;
        double lecturaAnterior;
        double lecturaActual;
        double consumo;
        double costo;
        double monto;
        Scanner entrada = new Scanner(System.in);


        System.out.println("Ingrese la lectura anterior:");
        lecturaAnterior = entrada.nextDouble();

        System.out.println("Ingrese la lectura actual:");
        lecturaActual = entrada.nextDouble();

        consumo = lecturaActual - lecturaAnterior;
        if (consumo >= 0 && consumo <= 100) {
            rango = 1;
        } else if (consumo <= 300) {
            rango = 2;
        } else if (consumo <= 500) {
            rango = 3;
        } else {
            rango = 4;
        }
        switch (rango) {
            case 1:
                costo = 2622.00;
                monto = consumo * costo;
                System.out.println("Consumo: " + consumo + " KWh");
                System.out.println("Costo por KWh: " + costo + " Bs");
                System.out.println("Monto a pagar: " + monto + " Bs");
                break;
            case 2:
                costo = 79.78;
                monto = consumo * costo;
                System.out.println("Consumo: " + consumo + " KWh");
                System.out.println("Costo por KWh: " + costo + " Bs");
                System.out.println("Monto a pagar: " + monto + " Bs");
                break;
            case 3:
                costo = 89.52;
                monto = consumo * costo;
                System.out.println("Consumo: " + consumo + " KWh");
                System.out.println("Costo por KWh: " + costo + " Bs");
                System.out.println("Monto a pagar: " + monto + " Bs");
                break;
            case 4:
                costo = 97.95;
                monto = consumo * costo;
                System.out.println("Consumo: " + consumo + " KWh");
                System.out.println("Costo por KWh: " + costo + " Bs");
                System.out.println("Monto a pagar: " + monto + " Bs");
                break;
            default:
                costo = 0;
                System.out.println("conusmo no valido");


        }
        entrada.close();
    }
}