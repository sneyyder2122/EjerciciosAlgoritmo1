import java.util.Scanner;

public class PrimerEjercicio {
    public static void main(String[] args) {
        double inversion;
        double tasaInteres;
        double intereses;
        double total;

        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("Bienvenido al programa de inversion bancaria.");
            System.out.println("Digite la cantidad de dinero invertida:");
            inversion = entrada.nextDouble();

            System.out.println("Digite la tasa de interes anual en decimal (ejemplo: 0.12 para 12%):");
            tasaInteres = entrada.nextDouble();

            intereses = inversion * tasaInteres;
            System.out.println("Los intereses generados son: $" + intereses);

            if (intereses > 7000) {
                total = inversion + intereses;
                System.out.println("Los intereses exceden $7000, por lo tanto se reinvertiran.");
                System.out.println("El dinero final en la cuenta sera: $" + total);
            } else {
                System.out.println("Los intereses no exceden $7000, por lo tanto no se reinvierten.");
                System.out.println("El dinero final en la cuenta sera: $" + inversion);
            }
        }
    }
}

