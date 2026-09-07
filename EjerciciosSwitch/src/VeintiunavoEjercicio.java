import java.util.Scanner;
public class VeintiunavoEjercicio {
public static void main (String[] args){
    int opcion;
    int hipoteca;
    int totalinversion;
    int restoinversion;
    double inversion;
    double inversion2;
    double hipotecaSocio;

    Scanner entrada = new Scanner(System.in);
    System.out.println("Ingrese el valor de la hipoteca:");
    hipoteca = entrada.nextInt();
    System.out.println("Ingrese el valor de la inversion:");
    totalinversion = entrada.nextInt();

    if (hipoteca <1000000){
        opcion = 1;
    }else {
        opcion = 2;
    }
    switch (opcion){
        case 1:
             inversion = (totalinversion * 0.50);
             hipotecaSocio = (hipoteca * 0.50);

            System.out.println("El valor de la inversion es: " + inversion);
            System.out.println("Su socio debera invertir: " + hipotecaSocio);
            break;
        case 2:
             restoinversion = totalinversion - hipoteca;
             inversion2 = restoinversion/2.0;
            System.out.println("El valor restante de la inversion es de: " + restoinversion);
            System.out.println("Entre su socio y usted, deben pagar: " + inversion2 + " cada uno");

    }
    entrada.close();
    }
  }

