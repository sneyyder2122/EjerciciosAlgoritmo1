import java.util.Scanner;
public class SegundoEjercicio {
    public static void main(String[] args) {
        double SueldoTrabajador;
        double Aumento;
        double Contrario;
        double PorcentajeAumento = 0.15;
        double porcentajeContrario = 0.12;
        double SueldoTotal;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Bienvenido al programa para calcular el aumento del sueldo. por favor, ingrese los siguentes datos. ");
        System.out.println("\n ingrese el sueldo del trabajador");
        SueldoTrabajador = entrada.nextDouble();

        switch (Double.compare(SueldoTrabajador, 40000)) {

            case -1:
            case 0:
                Aumento = SueldoTrabajador * PorcentajeAumento;
                SueldoTotal = SueldoTrabajador + Aumento;

                System.out.println("El aumento aplicado es de " + Aumento);
                System.out.println("El sueldo total del trabajador es: " + SueldoTotal);

                break;

            default:
                Contrario = SueldoTrabajador * porcentajeContrario;
                SueldoTotal = SueldoTrabajador + Contrario;

                System.out.println("El aumento aplicado es de " + Contrario);
                System.out.println("El sueldo total del trabajador es: " + SueldoTotal);
        }
        entrada.close();
        }
    }


