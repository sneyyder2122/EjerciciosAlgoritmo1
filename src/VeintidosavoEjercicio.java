import java.util.Scanner;
public class VeintidosavoEjercicio {
    public static void main(String[] args) {
        int opcion;
        double A;
        double B;
        double C;
        double D;
        double x1;
        double x2;
        Scanner entrada = new Scanner(System.in);

        System.out.println("ingrese el valor de A");
        A = entrada.nextDouble();
        System.out.println("ingrese el valor de B");
        B = entrada.nextDouble();
        System.out.println("ingrese el valor de C");
        C = entrada.nextDouble();

        D = B * B - 4 * A * C;
        System.out.println("la discriminante es " + D);

        if (D == 0) {
            opcion = 1;
        } else if (D > 0) {
            opcion = 2;
        }else {
            opcion = 3;
        }

            switch (opcion) {
                case 1:
                    x1 = x2 = -B / (2 * A);
                    System.out.println("el valor de x1 es " + x1);
                    System.out.println("el valor de x2 es " + x2);
                    break;
                case 2:
                    x1 = (-B + Math.sqrt(D)) / (2 * A);
                    x2 = (-B - Math.sqrt(D)) / (2 * A);
                    System.out.println("el valor de x1 es " + x1);
                    System.out.println("el valor de x1 es " + x2);
                    break;
                case 3:
                    System.out.println("No existe una solucion");
                    break;
                default:
                    System.out.println("opcion no valida");
            }
        entrada.close();
        }
    }

