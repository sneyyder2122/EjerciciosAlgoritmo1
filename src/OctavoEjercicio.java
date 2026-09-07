import java.util.Scanner;
public class OctavoEjercicio {
    public static void main (String[] args) {
        double DistanciaRecorrida;
        double pago;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa los kilometros recorridos");
        DistanciaRecorrida = entrada.nextDouble();

        switch (Double.compare(DistanciaRecorrida, 300)) {
            case -1:
            case 0: {
                pago = 5000;

                System.out.println("el pago a realizar es " + pago);
                break;
            }

            default:{

                switch (Double.compare(DistanciaRecorrida,1000)){

                    case -1: {
                        pago = 5000 + 200 * (DistanciaRecorrida - 300);

                        System.out.println("El pago a realizar es: $" + pago);
                        break;
                    }
                    case 0:
                    default:
                        pago = 5000
                                + 200 * 700
                                + 150 * (DistanciaRecorrida - 1000);

                        System.out.println("El pago a realizar es: $" + pago);
                        break;
                }
            }

        }
        entrada.close();
    }
}

